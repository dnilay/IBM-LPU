package comm.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comm.example.demo.bean.Account;
import comm.example.demo.repo.AccountDAO;
@Service
public class AccountServiceImpl implements AccountService {
	private AccountDAO accountDAO;

	@Autowired
	public AccountServiceImpl(AccountDAO accountDAO) {
		super();
		this.accountDAO = accountDAO;
	}

	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDAO.createAccount(account);
	}

}
