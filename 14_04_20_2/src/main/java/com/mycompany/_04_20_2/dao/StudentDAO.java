package com.mycompany._04_20_2.dao;

import java.util.List;

import com.mycompany._04_20_2.domain.Student;

public interface StudentDAO {
	
	public Student createStudent(Student student);
	public List<Student> getAllStudent();
	public Student getStudentByID(String studnetID);

}
