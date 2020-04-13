package comm.example.demo.repo;

import java.util.List;

import comm.example.demo.bean.Account;

public interface AccountDAO {
	
	public Account createAccount(Account account);
	public List<Account> getAllAccountDetails();
	
	public Account findByAccountNumber(String accountNumber);

}
