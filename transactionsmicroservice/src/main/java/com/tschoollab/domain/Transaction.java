package com.tschoollab.domain;

import java.util.Date;

public class Transaction {
	public static final String DEBIT = "DEBIT";
	public static final String CREDIT = "CREDIT";
	
	private Date txnDate;
	public Date getTxnDate() {
		return txnDate;
	}
	public void setTxnDate(Date txnDate) {
		this.txnDate = txnDate;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private long amount;
	private long accountId;
	private String type;
	
	

}
