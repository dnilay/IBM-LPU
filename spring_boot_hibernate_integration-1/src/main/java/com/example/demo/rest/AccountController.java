package com.example.demo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Account;
import com.example.demo.service.AccountService;

@RestController
@RequestMapping("/api")
public class AccountController {

	private AccountService accountService;
	
	public AccountController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}



	@GetMapping("/accounts")
	public ResponseEntity<Iterable<Account>> getAllAccounts()
	{
		return accountService.getAccounts();
	}
}
