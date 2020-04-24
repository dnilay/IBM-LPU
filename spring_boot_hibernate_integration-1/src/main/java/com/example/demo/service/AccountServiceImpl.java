package com.example.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.AccountDAO;
import com.example.demo.data.Account;
@Service(value = "accountService")
@EnableTransactionManagement
public class AccountServiceImpl implements AccountService {
	
	private AccountDAO accountDAO;

	public AccountServiceImpl(AccountDAO accountDAO) {
		super();
		this.accountDAO = accountDAO;
	}

	@Override
	@Transactional
	public ResponseEntity<Iterable<Account>> getAccounts() {
		
		Iterable<Account> accounts=accountDAO.findAll();
		return ResponseEntity.ok().body(accounts);
	}

}
