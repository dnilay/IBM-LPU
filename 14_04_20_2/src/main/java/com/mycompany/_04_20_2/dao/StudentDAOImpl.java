package com.mycompany._04_20_2.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mycompany._04_20_2.domain.Student;
import com.mycompany._04_20_2.factory.MyHibernateFactory;

public class StudentDAOImpl implements StudentDAO {
	
	private  MyHibernateFactory factory=null;
	private SessionFactory sessionFactory=null;
	private Session session=null;
	
	{
		factory=MyHibernateFactory.getMyHibernateFactory();
		sessionFactory=factory.getSessionFactory();
		session=sessionFactory.openSession();
	}

	public Student createStudent(Student student) {
		
		session.getTransaction().begin();
		session.save(student);
		session.getTransaction().commit();
	//	session.close();
		return student;
	}

	public List<Student> getAllStudent() {
		List<Student> list=session.createQuery("from Student",Student.class).list();
		
		return list;
	}

	public Student getStudentByID(String studnetID) {
		// TODO Auto-generated method stub
		return session.get(Student.class, studnetID);
	}

}
