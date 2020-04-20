package comm.example.model;

public class ToDo {
	
	private int id;
	private String name;
	private String completedBy;
	public ToDo() {
		super();
	}
	public ToDo(int id, String name, String completedBy) {
		super();
		this.id = id;
		this.name = name;
		this.completedBy = completedBy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompletedBy() {
		return completedBy;
	}
	public void setCompletedBy(String completedBy) {
		this.completedBy = completedBy;
	}

}
