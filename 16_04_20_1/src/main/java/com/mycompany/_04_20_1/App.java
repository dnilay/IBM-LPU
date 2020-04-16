package com.mycompany._04_20_1;

import java.util.Collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany._04_20_1.dao.EmployeeDAO;
import com.mycompany._04_20_1.dao.EmployeeDAOImpl;
import com.mycompany._04_20_1.entity.Employee;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDAO dao = context.getBean("dao", EmployeeDAOImpl.class);

		/*
		 * Employee e = dao.createEmployee(new Employee("Sachin", 20000));
		 * System.out.println("done!" + e);
		 */
		// dao.removeEmployee(1);

		Employee employee = dao.raiseEmployeeSalary(2, 1000);
		if (employee == null) {
			System.out.println("raise salary aborted.");
		} else {
			System.out.println("Updated Employee: " + employee);
		}

		Collection<Employee> collection = dao.findAllEmployees();
		for (Employee e : collection) {
			System.out.println(e);
		}

	}
}
