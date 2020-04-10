package comm.example.bean;

import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		 * Coach theCoach=context.getBean("myCoach",Coach.class);
		 * System.out.println(theCoach.getDailyFortune());
		 * System.out.println(theCoach.getDailyWorkout());
		 */
		Customer customer=context.getBean("theCustomer",Customer.class);
		customer.setCustomerID(UUID.randomUUID().toString());
		System.out.println(customer);
		
	}

}
