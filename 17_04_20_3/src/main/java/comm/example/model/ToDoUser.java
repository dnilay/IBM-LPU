package comm.example.model;

public class ToDoUser {
	
	private String userId;
	private String password;
	public ToDoUser() {
		super();
	}
	public ToDoUser(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
