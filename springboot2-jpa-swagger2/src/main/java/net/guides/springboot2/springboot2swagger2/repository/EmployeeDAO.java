package net.guides.springboot2.springboot2swagger2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.guides.springboot2.springboot2swagger2.model.Employee;
@Repository(value = "")
public interface EmployeeDAO extends CrudRepository<Employee, Long>{

}
