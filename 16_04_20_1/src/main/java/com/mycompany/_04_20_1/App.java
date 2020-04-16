package com.mycompany._04_20_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany._04_20_1.dao.EmployeeDAO;
import com.mycompany._04_20_1.dao.EmployeeDAOImpl;
import com.mycompany._04_20_1.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=
    			new ClassPathXmlApplicationContext("applicationContext.xml");
    	EmployeeDAO dao=context.getBean("dao",EmployeeDAOImpl.class);
    	Employee e=dao.createEmployee(new Employee("John", 10000));
    	System.out.println("done!"+e);
    }
}
