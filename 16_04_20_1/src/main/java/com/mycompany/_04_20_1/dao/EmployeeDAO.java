package com.mycompany._04_20_1.dao;

import java.util.Collection;

import com.mycompany._04_20_1.entity.Employee;

public interface EmployeeDAO {

	public Employee createEmployee(Employee employee);

	public void removeEmployee(int id);

	public Employee raiseEmployeeSalary(int id, long raise);

	public Employee findEmployee(int id);

	public Collection<Employee> findAllEmployees();
}
