package com.mycompany._04_20_1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="EMPLOYEE")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeID;
	@Version
	private int version;
	private String name;
	private int salary;
	
	public Employee() {
		super();
	}

	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee ID: "+getEmployeeID()+" Employee Name: "+getName()+" Numver Of Time employee Updated: "
				+getVersion()+" Salary: "+getSalary();
	}

}
