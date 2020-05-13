package comm.example;

public class StringConcatination {
	
	public String concatonateString(String string1,String string2)
	{
		validate(string1,string2);
		return string1.concat(string2);
	}

	public void validate(String string1, String string2) {
		if((string1.length()<2) ||(string2.length()<2))
		{
			throw new StringTooShortException("string is too short "+ string1+ " "+string2);
		}
		
	}

}
