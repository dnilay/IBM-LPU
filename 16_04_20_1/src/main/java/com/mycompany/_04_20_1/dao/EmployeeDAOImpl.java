package com.mycompany._04_20_1.dao;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany._04_20_1.entity.Employee;

@Repository("dao")
public class EmployeeDAOImpl implements EmployeeDAO {

	private SessionFactory sessionFactory;
	private EntityManagerFactory factory;
	private EntityManager entityManager;

	@Autowired
	public EmployeeDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@PostConstruct
	public void init() {
		factory = sessionFactory.unwrap(SessionFactory.class);
		entityManager = factory.createEntityManager();
	}

	@Override
	public Employee createEmployee(Employee employee) {

		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		return employee;
	}

	@Override
	public void removeEmployee(int id) {
		Employee employee = findEmployee(id);
		if (employee == null) {
			System.out.println("deletion aborted");
		} else {
			entityManager.getTransaction().begin();
			entityManager.remove(employee);
			entityManager.getTransaction().commit();
			System.out.println("employee deleted successfully." + employee);
		}

	}

	@Override
	public Employee raiseEmployeeSalary(int id, long raise) {
		Employee employee = findEmployee(id);
		if (employee == null) {
			return null;
		}

		else {
			employee.setSalary(employee.getSalary() + raise);
			entityManager.getTransaction().begin();
			entityManager.merge(employee);
			entityManager.getTransaction().commit();
			return employee;
		}

	}

	@Override
	public Employee findEmployee(int id) {

		Employee employee = entityManager.find(Employee.class, id);
		if (employee == null) {
			System.out.println("no such employee found with id: " + id);
			return null;
		} else {
			return employee;
		}

	}

	@Override
	public Collection<Employee> findAllEmployees() {

		return entityManager.createQuery("select e from Employee e", Employee.class).getResultList();
	}

}
