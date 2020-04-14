package com.mycompany._04_20_2.service;

import java.util.List;

import com.mycompany._04_20_2.dao.StudentDAO;
import com.mycompany._04_20_2.dao.StudentDAOImpl;
import com.mycompany._04_20_2.domain.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDAO dao;
	
	{
		dao=new StudentDAOImpl();
	}
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.createStudent(student);
	}

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return dao.getAllStudent();
	}

}
