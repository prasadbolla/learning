package com.lab.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
public class BankingBFFController {
	@HystrixCommand(groupKey="customerdetails", fallbackMethod="fallbackCustomer",
		    commandProperties={
				@HystrixProperty(name = "execution.timeout.enabled",value="false"),
		    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
		    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "15000")
				})
	
	@RequestMapping("/customerdetails")
	 public String getCustomerDetails() throws Exception{
		    
		    StringBuffer body = new StringBuffer("");
		    RestTemplate restTemplate = new RestTemplate();

		    //get customer data - replace URL appropriately
		    String customerURL = "https://customer-prasadbolla.mybluemix.net/customers";
		    ResponseEntity<Object> s1 = restTemplate.getForEntity(customerURL, Object.class);
		    body.append("Customer Details: " + s1.getBody().toString() + "\n");

/*		    //get account data  - replace URL appropriately
		    String accountURL = "https://account-prasadbolla.mybluemix.net/accounts";
		    ResponseEntity<Object> s2 = restTemplate.getForEntity(accountURL, Object.class);
		    body.append("Account Details: " + s2.getBody().toString() + "\n");

		    //get transactions data  - replace URL appropriately
		    String transactionsURL = "https://transactions-prasadbolla.mybluemix.net/transactions";
		    ResponseEntity<Object> s3 = restTemplate.getForEntity(transactionsURL, Object.class);
		    body.append("Account Balance: " + s3.getBody().toString() + "\n");*/

		    return body.toString();

		  }
	@RequestMapping("/getAccounts")
	 public String getAccounts() throws Exception{
		    
		    StringBuffer body = new StringBuffer("");
		    RestTemplate restTemplate = new RestTemplate();


		    //get account data  - replace URL appropriately
		    String accountURL = "https://account-prasadbolla.mybluemix.net/accounts";
		    ResponseEntity<Object> s2 = restTemplate.getForEntity(accountURL, Object.class);
		    body.append("Account Details: " + s2.getBody().toString() + "\n");

		    return body.toString();

		  }
	@RequestMapping("/getAccountBalance")
	 public String getAccountBalance() throws Exception{
		    
		    StringBuffer body = new StringBuffer("");
		    RestTemplate restTemplate = new RestTemplate();


		    //get transactions data  - replace URL appropriately
		    String transactionsURL = "https://transactions-prasadbolla.mybluemix.net/transactions";
		    ResponseEntity<Object> s3 = restTemplate.getForEntity(transactionsURL, Object.class);
		    body.append("Account Balance: " + s3.getBody().toString() + "\n");

		    return body.toString();

		  }
	@RequestMapping("/fallbackCustomer")
	public String fallbackCustomer(){
		  //ideally you would use redis or other local caching mechanism here
		  //keeping it simple for now
				return "Cached Customer Data";
			}
}
