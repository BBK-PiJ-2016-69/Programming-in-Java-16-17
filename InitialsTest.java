import org.junit.*;
import static org.junit.Assert.*;


public class InitialsTest {
	@Test
	public void testsNormalName() {

		Initials initials = new Initials();
		String input = "Matthew Grint";
		String output = initials.getInitials(input);
		String expected = "MG";
		assertEquals(output, expected);
	}

	@Test
	public void testsLongerName() {

		Initials initials = new Initials();
		String input = "Matthew James Grint";
		String output = initials.getInitials(input);
		String expected = "MJG";
		assertEquals(output, expected);
	}

	@Test
	public void testsExtraSpace() {

		Initials initials = new Initials();
		String input = "Matthew  Grint";
		String output = initials.getInitials(input);
		String expected = "MG";
		assertEquals(output, expected);
	}

	@Test
	public void testsThirdSpace() {

		Initials initials = new Initials();
		String input = "Matthew   Grint";
		String output = initials.getInitials(input);
		String expected = "MG";
		assertEquals(output, expected);
	}


}