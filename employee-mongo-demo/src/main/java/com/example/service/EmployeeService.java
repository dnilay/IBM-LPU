package com.example.service;

import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import com.example.domain.Employee;


public interface EmployeeService {
	
	public List<Employee> getAllEmployee();
	public Employee createEmployee(Employee employee);
	public List<Employee> getEmployeeByEmail(String email);

}
