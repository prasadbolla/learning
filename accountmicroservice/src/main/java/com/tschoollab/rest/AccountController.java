package com.tschoollab.rest;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tschoollab.domain.Account;

import java.util.ArrayList;
import java.util.List;


@RestController
public class AccountController {

	private  List<Account> accountList = new ArrayList<Account>();
	
	@RequestMapping ("/accounts")
	public List<Account> getAccounts(Long custId){
		return accountList;
	}
	
	public AccountController(){
		super();
		long[] custIdArr = {1011,7453,2367,3654,9976,8841};
		for(int i = 0;i<6;i++){
			Account account = new Account();
			if(i==0) 
				account.setAccountId(101);
			else
				account.setAccountId(111*i);
			if( (i==3) || (i==5) ) 
				account.setAccountType(Account.CURRENT);
			else
				account.setAccountType(Account.SAVINGS);
			account.setCustId(custIdArr[i]);
			accountList.add(account);
		}
		
	}
	
}

