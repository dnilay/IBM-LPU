package comm.example;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
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

	@Parameters
	public static Collection testValues() {
		return Arrays.asList(new Object[][] {
				{ "hello ", "world", "hello world" },
				{ "Code ", "with Passion!", "Code with Passion!" },
				{ "Life is ", "good", "Life is good" },
				{"Java","Passion","Java Passion"}
		});
	}

	@Before
	public void setup() {
		stringConcatenator = new StringConcatination();
	}
	@Test
	public void testContaninate()
	{
		assertThat(stringConcatenator.concatonateString(string1, string2), is(result));
		assertEquals(result, stringConcatenator.concatonateString(string1,string2));
	}



}
