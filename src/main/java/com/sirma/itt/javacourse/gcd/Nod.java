package main.java.com.sirma.itt.javacourse.gcd;

/**
 * The class which gets two numbers and calculates their gcd.
 * 
 * @author Nikolay Ch
 */

public class Nod {

	/**
	 * Finds the gcd by the algorithm bigger - smaller until they are not equal.
	 * 
	 * @return the gcd of the two values.
	 */

	public static int calculate(int first, int second) {
		while (first != second) {
			if (first > second)
				first = first - second;
			else
				second = second - first;
		}

		// Prints the wanted gcd.

		return first;

	}

}
