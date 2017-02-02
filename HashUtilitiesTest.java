import org.junit.*;
import static org.junit.Assert.*;


public class HashUtilitiesTest {

	@Test
	public void testsShortHash() {
		int output, i;
		for (i = 0; i < 2000; i++){
			int testInteger = 1000;
			//(int)(Math.random()*100);
			output =  HashUtilities.shortHash(testInteger);
			System.out.println(output);
			assertTrue(0 < output);
			assertTrue(output < 1000);
		}
	}
}