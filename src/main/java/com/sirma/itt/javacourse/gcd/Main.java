package com.sirma.itt.javacourse.gcd;

import java.util.Scanner;

/**
 * The class which gets two numbers from the keyboard and calculates their gcd.
 * 
 * @author Nikolay Ch
 */

class Nod {
	public static void main(String[] args) {
		/**
		 * The variables for the two numbers.
		 */
		int first;
		int second;
		/**
		 * Initializes the variables from the keyboard.
		 */
		System.out.println("Enter the values: ");
		Scanner bufferInput = new Scanner(System.in);

		first = bufferInput.nextInt();
		second = bufferInput.nextInt();

		bufferInput.close();

		/**
		 * Finds the gcd by the algorithm bigger - smaller until they are not
		 * equal.
		 * 
		 */
		while (first != second) {
			if (first > second)
				first = first - second;
			else
				second = second - first;
		}

		/**
		 * @prints the wanted gcd
		 */

		System.out.print("The nod is: \n" + first);

	}
}
