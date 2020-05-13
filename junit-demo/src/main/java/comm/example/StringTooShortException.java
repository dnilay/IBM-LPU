package comm.example;

public class StringTooShortException extends RuntimeException {
	
	public StringTooShortException(String message)
	{
		super(message);
	}

}
