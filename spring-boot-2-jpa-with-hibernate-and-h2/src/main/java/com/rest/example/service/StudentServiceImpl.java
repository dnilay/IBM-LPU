package com.rest.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.example.model.Student;
import com.rest.example.repo.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	@Autowired
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public Iterable<Student> findByName(String name) {
		// TODO Auto-generated method stub
		return studentRepository.findByName(name);
	}

}
