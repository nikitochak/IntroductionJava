package main.java.com.sirma.itt.javacourse.arrayreverse;

/**
 * This class has methods for initializing an array, reversing its elements and
 * printing them on the console.
 * 
 * @author Nikolay Ch
 */
public class ArrayReverse {

	/**
	 * Initializes an array.
	 */
	public void initializeArray(int[] array, int n) {

		for (int i = 0; i < n; i++) {
			array[i] = i;
		}
	}

	/**
	 * Reverses the array by finding the middle element and changing the values.
	 * 
	 * @param array
	 *            the array which elements must be reversed
	 */
	public void reverseArray(int[] array) {

		int middle = (int) (array.length / 2);
		int len = array.length - 1;

		for (int i = 0; i <= middle; i++) {
			int k;
			k = array[i];

			array[i] = array[len - i];
			array[len - i] = k;

		}
	}

	/**
	 * Prints the elements of an array.
	 * 
	 * @param array
	 *            the array which we want to print
	 */
	public static void printArray(int[] array) {
		for (int i = 0; i <= array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
