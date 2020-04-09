package comm.example.demo;

import java.util.List;
import java.util.Scanner;

import comm.example.demo.model.ToDo;
import comm.example.demo.service.ToDoService;
import comm.example.demo.service.ToDoServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	private ToDoService service;
	private static Scanner scanner = new Scanner(System.in);

	{
		service = new ToDoServiceImpl();
	}

	public static void main(String[] args) {

		int choice = 0;
		App app=new App();

		do {
			System.out.println("1. Create Task.");
			System.out.println("2. Display All Task.");
			System.out.print("chose your choice: ");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter ToDO Name: ");
				app.service.createTask(new ToDo(scanner.next()));
				break;
			case 2:
				List<ToDo> list=app.service.getAllToDo();
				for(ToDo todo:list)
				{
					System.out.println(todo);
				}
				break;
			case 0:
				System.out.println("bye.!!!!!");
				System.exit(0);
				break;
			default:
				break;
			}

		} while (choice != 0);

	}
}
