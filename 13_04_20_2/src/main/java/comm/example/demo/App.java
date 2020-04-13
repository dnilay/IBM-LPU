package comm.example.demo;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.example.demo.bean.ToDo;
import comm.example.demo.repo.ToDoRepository;
import comm.example.demo.repo.ToDoRepositoryImpl;

public class App 
{

	
	
	
	public static void main( String[] args )
    {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		ToDoRepository toDoRepository=context.getBean("toDoRepositoryImpl",ToDoRepositoryImpl.class); 
		ToDo todo=toDoRepository.createToDo(new ToDo(UUID.randomUUID().toString(), "compile"));
		System.out.println(todo);
    }
}
