package test.java.com.sirma.itt.javacourse.gcd;

import static org.testng.AssertJUnit.assertEquals;
import main.java.com.sirma.itt.javacourse.gcd.Nod;

import org.testng.annotations.Test;

/**
 * Tests the methods in class Nod
 * 
 * @author Nikolay Ch
 * 
 */
public class GCDTest {
	/**
	 * Tests the method for finding the gcd of two numbers.
	 */
	@Test
	public void testCalculate() {

		assertEquals(5, Nod.calculate(5, 25));
		assertEquals(3, Nod.calculate(21, 12));
		assertEquals(12, Nod.calculate(24, 12));
	}
}
