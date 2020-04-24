package com.rest.example.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rest.example.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

	@Query
	public Iterable<Student> findByName(String name);
	public Iterable<Student> findByPassportNumber(String passportNumber);
	public Iterable<Student> findByNameAndPassportNumber(String name,String passportNumber);
	public void removeByName(String name);

}
