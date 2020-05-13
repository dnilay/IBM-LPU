package com.example.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Document
@Data
@AllArgsConstructor
public class Employee {
	@Id
	private String employeeID;
	private String firstName;
	private String lastName;
	private String email;

}
