package com.example.mongodbemployeeservice.dao;

import com.example.mongodbemployeeservice.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Repository

public interface EmployeeRepository  extends MongoRepository<Employee,String> {
}
