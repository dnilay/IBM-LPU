package com.mycompany._04_20_2.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany._04_20_2.domain.Student;

public class MyHibernateFactory {

	private SessionFactory sessionFactory;

	private static MyHibernateFactory factory;

	private MyHibernateFactory() {

	}

	public SessionFactory getSessionFactory()
	{
		sessionFactory=new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		return sessionFactory;
	}
	
	public static MyHibernateFactory getMyHibernateFactory()
	{
		if(factory==null)
		{
			factory=new MyHibernateFactory();
		}
		return factory;
	}

}
