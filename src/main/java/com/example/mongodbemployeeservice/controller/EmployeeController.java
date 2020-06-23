package com.example.mongodbemployeeservice.controller;

import com.example.mongodbemployeeservice.model.Employee;
import com.example.mongodbemployeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees()
    {
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.getAllEmployees());
    }
    @PostMapping("/employees")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body((employeeService.createEmployee(employee)));
    }
}
