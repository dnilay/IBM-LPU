package com.example.mongodbemployeeservice.service;

import com.example.mongodbemployeeservice.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee createEmployee(Employee employee);
    public List<Employee> getAllEmployees();

}
