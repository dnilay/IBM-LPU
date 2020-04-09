package comm.example.demo.service;

import java.util.List;

import comm.example.demo.dao.ToDoDao;
import comm.example.demo.dao.ToDoDaoImpl;
import comm.example.demo.model.ToDo;

public class ToDoServiceImpl implements ToDoService {
	private ToDoDao dao;
	
	{
		dao=new ToDoDaoImpl();
	}

	public void createTask(ToDo todo) {
		dao.createTask(todo);
	}

	public List<ToDo> getAllToDo() {
		// TODO Auto-generated method stub
		return dao.getAllToDo();
	}

}
