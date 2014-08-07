package test.java.com.sirma.itt.javacourse.arrayreverse;

import main.java.com.sirma.itt.javacourse.arrayreverse.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests the methods in the class for reversing the elements of the array.
 * 
 * @author Admin
 * 
 */
public class ArrayRevTest {

	/**
	 * Initializes an array with random values. Invokes the method for reversing
	 * the elements.
	 */
	@Test
	public void testReverse() {
		int[] array = new int[10];
		ArrayReverse reverse = new ArrayReverse();
		reverse.initializeArray(array, 10);
		reverse.reverseArray(array);
		assertEquals(array[0], 9);
	}
}
