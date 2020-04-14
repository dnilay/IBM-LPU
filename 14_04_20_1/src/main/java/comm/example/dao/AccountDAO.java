package comm.example.dao;

import java.util.List;

import comm.example.bean.Account;

public interface AccountDAO {
	
	public Account createAccount(Account account);
	public List<Account> getAllAccountDetails();
	
	public Account findByAccountNumber(String accountNumber);
	public List<Account> findByAmount(int amount);
	
	public void deleteById(String accountNumber);

}
