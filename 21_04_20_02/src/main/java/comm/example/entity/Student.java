package comm.example.entity;

public class Student {

	private int studentID;
	private String firstName;
	private String lastName;
	
	public Student() {
		
	}




	public Student(int studentID, String firstName, String lastName) {
		super();
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
