package com.mycompany._04_20_2;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import com.mycompany._04_20_2.domain.Student;
import com.mycompany._04_20_2.service.StudentService;
import com.mycompany._04_20_2.service.StudentServiceImpl;

public class App {
	private static StudentService service = null;
	private static Scanner scanner = new Scanner(System.in);
	static {
		service = new StudentServiceImpl();
	}

	public static void main(String[] args) {
		String fName, lName, email;
		int choice = -1;
		do {
			System.out.println("1. Create Student");
			System.out.println("2. Display All Available Student");
			System.out.println("3. Display Student BY ID");
			System.out.print("enter your choice:  ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Student First Name: ");
				fName = scanner.next();
				System.out.print("Student Lastst Name: ");
				lName = scanner.next();
				System.out.print("Student Email: ");
				email = scanner.next();
				Student student = new Student();
				student.setFirstName(fName);
				student.setLastName(lName);
				student.setEmail(email);
				//student.setId(UUID.randomUUID().toString());
				student = service.createStudent(student);
				System.out.println(student);
				break;
			case 2:
				List<Student> list = service.getAllStudent();
				for (Student s : list) {
					System.out.println(s);
				}
				break;
			case 3:
				System.out.print("Enter Student ID: ");
				student = service.getStudentByID(scanner.next());
				if (student == null) {
					System.out.println("No Such Student Found With given ID: ");
				} else {
					System.out.println(student);
				}
				break;
			case 0:
				System.out.println("Bye!!");
				System.exit(0);
			default:
				System.out.println("Invalid Choice.");
				break;
			}

		} while (choice != 0);

		/*
		 * try {
		 * 
		 * SessionFactory factory=new
		 * Configuration().configure().addAnnotatedClass(Student.class).
		 * buildSessionFactory(); Session session=factory.openSession(); Student
		 * student=new Student(); student.setId(UUID.randomUUID().toString());
		 * student.setFirstName("John"); student.setLastName("Doe");
		 * student.setEmail("john@demo.com"); session.getTransaction().begin();
		 * session.save(student); session.getTransaction().commit();
		 * System.out.println("One Item Saved Successfully..!");
		 * 
		 * } catch (Exception e) {
		 * 
		 * }
		 */
	}
}
