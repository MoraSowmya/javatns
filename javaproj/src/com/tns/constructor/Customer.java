package com.tns.constructor;

public class Customer {
	private String customername;
	private int customerid;
	private String customeradreess;
	
	// default constructor
	
	Customer(){
		System.out.println("default");
	}

	// parameter constructor
	
	public Customer(String customername, int customerid, String customeradreess) {
		
		this.customername = customername;
		this.customerid = customerid;
		this.customeradreess = customeradreess;
	}
	
	// getter and setter

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomeradreess() {
		return customeradreess;
	}

	public void setCustomeradreess(String customeradreess) {
		this.customeradreess = customeradreess;
	}

	@Override
	public String toString() {
		return "Customer [customername=" + customername + ", customerid=" + customerid + ", customeradreess="
				+ customeradreess + "]";
	}
	
}
