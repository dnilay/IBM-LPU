package comm.example.exception;

public class StudentNotFoundException extends Throwable{
	
	private static final long serialVersionUID = 3289290139523389288L;
	private String message;

	public StudentNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "StudentNotFoundException [message=" + message + "]";
	}
	

}
