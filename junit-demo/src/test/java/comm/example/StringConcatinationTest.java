package comm.example;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class StringConcatinationTest {

	private StringConcatination stringConcatenator;
	private String string1;
	private String string2;
	private String result;
	
	public StringConcatinationTest(String string1, String string2, String result) {
		this.string1 = string1;
		this.string2 = string2;
		this.result = result;
	}

	
	  @Parameters public static Collection testValues() { return Arrays.asList(new
	  Object[][] { { "hellos", "world", "h world" }, { "Code ", "with Passion!",
	  "Code with Passion!" }, { "Life is ", "good", "Life is good" },
	  {"Java ","Passion","Java Passion"} }); }
	 

	@Before
	public void setup() {
		stringConcatenator = new StringConcatination();
	}
	
	  @Test public void testContaninate() {
	  assertThat(stringConcatenator.concatonateString(string1, string2),
	  is(result)); assertEquals(result,
	  stringConcatenator.concatonateString(string1,string2)); }
	 
	/*
	 * @Test(expected = StringTooShortException.class) public void
	 * should_throw_StringTooShortException_when_less_than_2_string() { String
	 * string1 = "a"; String string2 = "C";
	 * stringConcatenator.concatonateString(string1, string2); }
	 */
	  
	 @Rule
	 public ExpectedException expectedException=ExpectedException.none();
	 @Test
	 public void testExcptionWithMessage()throws Exception
	 {
		string1="a";
		string2="code";
		expectedException.expect(StringTooShortException.class);
		expectedException.expectMessage("string is too short "+ string1+ " "+string2);
		stringConcatenator.concatonateString(string1, string2);
	 }



}
