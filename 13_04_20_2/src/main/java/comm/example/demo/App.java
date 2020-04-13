package comm.example.demo;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.example.demo.bean.ToDo;
import comm.example.demo.repo.ToDoRepository;
import comm.example.demo.repo.ToDoRepositoryImpl;
import comm.example.demo.service.ToDoService;
import comm.example.demo.service.ToDoServiceImpl;

public class App 
{

	
	
	
	public static void main( String[] args )
    {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		ToDoService service=context.getBean("toDoServiceImpl",ToDoServiceImpl.class);
		ToDo todo=context.getBean("toDo",ToDo.class);
		todo.setTodoID(UUID.randomUUID().toString());
		todo.setTodoName("testing");
		todo=service.createToDo(todo);
		System.out.println(todo);
		
    }
}
