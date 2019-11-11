package com.tschoollab.domain;

public class Customer {
	
	private Long custId;
	private Long getCustId() {
		return custId;
	}
	public void setCustId(Long custId) {
		this.custId = custId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String customerName;
	
	public String toString(){
		String customer = this.custId + ":" + this.customerName;
		return customer;
	}
	

}
