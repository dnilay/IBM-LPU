package com.example.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.dao.EmployeeRepository;
import com.example.domain.Employee;
@Service
@EnableAutoConfiguration
@EnableTransactionManagement
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employee.setEmployeeID(UUID.randomUUID().toString());
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getEmployeeByEmail(String email) {
		// TODO Auto-generated method stub
		return employeeRepository.findByEmail(email);
	}

}
