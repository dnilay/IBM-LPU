package com.mycompany._04_20_1.dao;

import com.mycompany._04_20_1.entity.Employee;

public interface EmployeeDAO {
	
	public Employee createEmployee(Employee employee);
	
	public void updateEmployee(Employee employee);

}
