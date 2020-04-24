package com.example.demo.dto;

public class AccountDto {

	private String accountID;
	private double balance;
	public AccountDto(String accountID, double balance) {
		super();
		this.accountID = accountID;
		this.balance = balance;
	}
	public AccountDto() {
		super();
	}
	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
