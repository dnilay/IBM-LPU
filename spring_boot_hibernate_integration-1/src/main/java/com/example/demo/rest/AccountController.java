package com.example.demo.rest;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Account;
import com.example.demo.dto.AccountDto;
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
	public ResponseEntity<List<AccountDto>> getAllAccounts()
	{
		List< AccountDto> l=new ArrayList<AccountDto>();
		Iterable<Account> list=accountService.getAccounts();
		for(Account a:list)
		{
			System.out.println(a);
			l.add(new ModelMapper().map(a, AccountDto.class));
			System.out.println(l);
			
		}
		return ResponseEntity.ok(l);
		
	}
}
