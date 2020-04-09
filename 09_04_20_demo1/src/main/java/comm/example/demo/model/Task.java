package comm.example.demo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Task {

	private String taskID;
	private List<ToDo> todos;
	
	{
		taskID=UUID.randomUUID().toString();
		todos=new ArrayList<ToDo>();
	}

	public void craeteToDo(ToDo todo) {
		todos.add(todo);
		System.out.println("todo added successfully.!");
	}

	public List<ToDo> getAllToDo()
	{
		return todos;
	}
}
