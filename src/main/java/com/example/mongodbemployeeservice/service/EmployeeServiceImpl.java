package com.example.mongodbemployeeservice.service;

import com.example.mongodbemployeeservice.dao.EmployeeRepository;
import com.example.mongodbemployeeservice.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service

public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    @Transactional
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
