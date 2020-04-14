package com.mycompany._04_20_2;

import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany._04_20_2.domain.Student;

public class App {
	public static void main(String[] args) {

		try {
			
			SessionFactory factory=new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
			Session session=factory.openSession();
			Student student=new Student();
			student.setId(UUID.randomUUID().toString());
			student.setFirstName("John");
			student.setLastName("Doe");
			student.setEmail("john@demo.com");
			session.getTransaction().begin();
			session.save(student);
			session.getTransaction().commit();
			System.out.println("One Item Saved Successfully..!");

		} catch (Exception e) {

		}
	}
}
