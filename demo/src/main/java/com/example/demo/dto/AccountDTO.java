package com.example.demo.dto;


public class AccountDTO {

	
	private int accountId;
	private String firstName;
	private String lastName;
	private String address;
	private int mobile;
	private String emailAddess;

	public AccountDTO(int accountId, String firstName, String lastName, String address, int mobile, String emailAddess) {
		super();
		this.accountId = accountId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobile = mobile;
		this.emailAddess = emailAddess;
	}
	
	public AccountDTO() {
		
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getEmailAddess() {
		return emailAddess;
	}

	public void setEmailAddess(String emailAddess) {
		this.emailAddess = emailAddess;
	}
	
	
	
}
