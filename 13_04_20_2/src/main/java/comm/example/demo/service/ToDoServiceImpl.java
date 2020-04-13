package comm.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comm.example.demo.bean.ToDo;
import comm.example.demo.repo.ToDoRepository;

@Service
public class ToDoServiceImpl implements ToDoService {
	
	private ToDoRepository toDoRepository;

	@Autowired
	public ToDoServiceImpl(ToDoRepository toDoRepository) {
		super();
		this.toDoRepository = toDoRepository;
	}

	public ToDo createToDo(ToDo todo) {
		
		return toDoRepository.createToDo(todo);
	}

}
