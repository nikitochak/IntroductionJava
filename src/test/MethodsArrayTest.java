package test;

import org.testng.annotations.Test;
import main.java.com.sirma.itt.javacourse.methodsarray.*;

/**
 * Tests some methods for arrays.
 * 
 * @author Nikolay Ch
 * 
 */
public class MethodsArrayTest {

	/**
	 * Tests the method for finding the minimum element of na array.
	 */
	@Test
	public void TestgetMinElementOfArray() {
		Help meth = new Help();
		for (int i = 0; i < 10; i++) {
			meth.Array[i] = i;
		}
		System.out.println(meth.getMinElement(meth.Array));
	}

	/**
	 * Tests the method for finding the sum of the elements in array.
	 */
	@Test
	public void TestGetSumOfArray() {
		Help meth = new Help();
		for (int i = 0; i < 10; i++) {
			meth.Array[i] = i;
		}
		System.out.println(meth.getSum(meth.Array));
	}

	/**
	 * Tests the method for printing the elements if an array on the screen.
	 */
	@Test
	public void TestrpintArray() {
		Help meth = new Help();
		for (int i = 0; i < 10; i++) {
			meth.Array[i] = i;
		}
		meth.printArray(meth.Array);
	}
}
