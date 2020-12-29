package com.demo.spring.entity;

public class Customer {
    @Id
	private int customerId;
	private String customerName;
	private String address;
	private String email;
	private String mobileNumber;
	public Customer() {
		
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Customer(int customerId, String customerName, String address, String email, String mobileNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}
	
	
}
