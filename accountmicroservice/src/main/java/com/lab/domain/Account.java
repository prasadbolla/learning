package com.lab.domain;

public class Account {
	
	public static final String SAVINGS = "savings";
	public static final String CURRENT = "current";
	
	private long custId;
	
	private long accountId;
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	private String accountType;	

}

