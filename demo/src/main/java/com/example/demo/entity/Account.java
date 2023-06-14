package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {

	@Id
	@Column(name = "account_id_", length = 45)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountId;
	
	@Column(name = "first_name_", length = 255)
	private String firstName;
	
	@Column(name = "last_name_", length = 255)
	private String lastName;
	
	@Column(name = "address_", length = 255)
	private String address;
	
	
	@Column(name = "mobile_", length = 20)
	private int mobile;
	
	
	@Column(name = "emailAdd_", length = 255)
	private String emailAddess;
	
	
	public Account(int accountId, String firstName, String lastName, String address, int mobile, String emailAddess) {
		super();
		this.accountId = accountId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobile = mobile;
		this.emailAddess = emailAddess;
	}
	
	public Account() {
		
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
