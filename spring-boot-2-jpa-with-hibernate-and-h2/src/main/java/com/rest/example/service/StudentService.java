package com.rest.example.service;

import com.rest.example.model.Student;

public interface StudentService {
	
	public Iterable<Student> findByName(String name);

}
