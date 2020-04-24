package com.rest.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.example.model.Student;
import com.rest.example.repo.StudentRepository;
import com.rest.example.service.StudentService;

@RestController
@RequestMapping("/api")
public class Studentcontroller {
	
	private StudentService studentService;

	@Autowired
	public Studentcontroller(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/students/{name}")
	public ResponseEntity<Iterable<Student>> getStudentsByName(@PathVariable("name") String name)
	{
		return ResponseEntity.ok().body(studentService.findByName(name));
	}


}
