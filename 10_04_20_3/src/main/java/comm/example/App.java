package comm.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.example.bean.Coach;

public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach=context.getBean("coach",Coach.class);
		System.out.println(theCoach);
	}
}
