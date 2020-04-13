package comm.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.example.demo.bean.Image;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Image image = context.getBean("i", Image.class);
		System.out.println(image);
	}
}
