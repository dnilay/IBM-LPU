package com.example.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Employee;
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>{
	
	public List<Employee> findByEmail(String email);

}
