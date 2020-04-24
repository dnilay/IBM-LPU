package com.example.demo.service;

import org.springframework.http.ResponseEntity;

import com.example.demo.data.Account;

public interface AccountService {
	
	public ResponseEntity<Iterable<Account>> getAccounts();

}
