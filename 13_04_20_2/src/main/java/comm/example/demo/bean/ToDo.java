package comm.example.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class ToDo {
	private String todoID;
	private String todoName;

	public ToDo() {
		super();
	}

	public ToDo(String todoID, String todoName) {
		super();
		this.todoID = todoID;
		this.todoName = todoName;
	}

	public String getTodoID() {
		return todoID;
	}

	public void setTodoID(String todoID) {
		this.todoID = todoID;
	}

	public String getTodoName() {
		return todoName;
	}

	public void setTodoName(String todoName) {
		this.todoName = todoName;
	}

	@Override
	public String toString() {
		return "ToDo [todoID=" + todoID + ", todoName=" + todoName + "]";
	}

}
