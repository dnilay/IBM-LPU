package comm.example;

import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.example.bean.CD;

public class App {
	public static void main(String[] args) {
		
		try {
			ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
			CD tempCD1=context.getBean("cd",CD.class);
			CD tempCD2=context.getBean("cd",CD.class);
			tempCD1.setCdID(UUID.randomUUID().toString());
			tempCD2.setCdID(UUID.randomUUID().toString());
			tempCD1.getDetails();
			tempCD2.getDetails();
			System.out.println(tempCD1==tempCD2);
			System.out.println("CD1:"+tempCD1);
			System.out.println("CD1:"+tempCD2);
			
		} catch (Exception e) {
			
		}

	}
}
