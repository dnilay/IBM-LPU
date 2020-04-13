package comm.example.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class Account {
	
	private String accountNumber;
	private AccountType accountType;
	private int initialBalance;

	public Account() {
		super();
	}
	public Account(String accountNumber, AccountType accountType, int initialBalance) {
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
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
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
