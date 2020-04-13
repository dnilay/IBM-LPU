package comm.example.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class Account {
	
	private String accountNumber;
	private String accountType;
	private int initialBalance;

	public Account() {
		super();
	}
	public Account(String accountNumber, String accountType, int initialBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.initialBalance = initialBalance;
		
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getInitialBalance() {
		return initialBalance;
	}
	public void setInitialBalance(int initialBalance) {
		this.initialBalance = initialBalance;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", initialBalance="
				+ initialBalance + "]";
	}

	
	

}
