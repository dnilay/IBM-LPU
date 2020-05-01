package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.client.Employeeclient;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api")
public class DepartmentController {
	
	private Employeeclient employeeclient;
	@Autowired
	public DepartmentController(Employeeclient employeeclient) {
	
		this.employeeclient = employeeclient;
	}

	@RequestMapping("/departments/hello")
	public ResponseEntity<String> sayHello(@RequestParam String name)
	{
		String result=employeeclient.callHi(name);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}

}
