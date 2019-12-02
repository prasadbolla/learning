package com.lab.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab.domain.Transaction;

import java.util.List;
import java.util.ArrayList;
import java.sql.Date;
import java.util.Calendar;

@RestController
public class TransactionController {
	List<Transaction> transactions = new ArrayList<Transaction>();
	@RequestMapping("/transactions")
	public List<Transaction> getTransactions(Long custId, Long accountId){
		return transactions;
	}
	
	public TransactionController(){
		super();
		for (int i=1;i<10;i++){
			Transaction trn = new Transaction();
			trn.setAccountId(111);
			trn.setTxnDate(Calendar.getInstance().getTime());
			if((i==4) || (i==8)){
				trn.setType(Transaction.DEBIT);
				trn.setAmount(2000);
			}
			else{
				trn.setType(Transaction.CREDIT);
				trn.setAmount(4000);
			}
			transactions.add(trn);
		}
		
	}
	
}
