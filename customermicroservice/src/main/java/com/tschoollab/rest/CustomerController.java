package com.tschoollab.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tschoollab.domain.Customer;



@RestController
public class CustomerController {
	private String[] custNameArr = {"John Doe","Jane Doe","Ethan Doe","Steve Banner","Eliza Stark","Shiv Lama"};
	private long[] custIdArr = {1011,7453,2367,3654,9976,8841};
	
	@RequestMapping("/customers")
	public List<Customer> getCustomers() throws Exception{
		if(Math.random() > .5) {
			Thread.sleep(1000*3);
			throw new RuntimeException("SOS!");
		}
		List<Customer> customers = new ArrayList<Customer>();
		for(int i=0; i<custNameArr.length; i++){
			Customer cust = new Customer();
			cust.setCustId(new Long(custIdArr[i]));
			cust.setCustomerName(custNameArr[i]);
			customers.add(cust);
		}
		return customers;
	}
	
	
	
	
}

