package main.java.com.sirma.itt.javacourse.bignumbers;

/**
 * Main class which finds the sum of a random numbers with random length and
 * prints the value.
 * 
 * @author Nikolay Ch
 */
public class SumOfTwoNumbers {

	/**
	 * Initializes a char array with only numbers.
	 * 
	 * @return the array with numbers.
	 */
	public char[] initializeNumbers(char[] number) {
		int size = (int) (Math.random() * 30 + 2);
		number = new char[size];
		for (int i = 0; i < size; i++) {
			number[i] = (char) (Math.random() * 9 + '0');
		}
		return number;
	}

	/**
	 * Sums the two numbers char by char and returns their sum.
	 * 
	 * @param firstNumber
	 *            the first long number
	 * @param secondNumber
	 *            the second long number
	 * @return their sum
	 */
	public static char[] sumLongNumbers(char[] firstNumber, char[] secondNumber) {

		int size3 = Math.max(firstNumber.length, secondNumber.length) + 1;
		char[] sumOfTheNumbers = new char[size3];
		boolean isAbove10 = false;// variable keeps if the sum is above 10
		int value = 0;
		for (int i = firstNumber.length - 1, j = secondNumber.length - 1, k = size3 - 1; k - 1 >= 0; i--, j--, k--) {

			if (isAbove10 == true) {
				value = 1;
			} else {
				value = 0; // if the previous sum is higher than 10 the value
			} // starts with 1

			if (i < 0) {
				value = value + (int) (secondNumber[j] - '0');
				if (value >= 10) {
					isAbove10 = true;
					value = value % 10;
				} else {
					isAbove10 = false;
				}
			} else if (j < 0) {
				value = value + (int) (firstNumber[i] - '0');
				if (value >= 10) {
					isAbove10 = true;
					value = value % 10;
				} else {
					isAbove10 = false;
				}
			} else {
				value = value + (int) (firstNumber[i] - '0')
						+ (int) (secondNumber[j] - '0');
				if (value >= 10) {
					isAbove10 = true;
					value = value % 10;
				} else
					isAbove10 = false;
			}

			sumOfTheNumbers[k] = (char) (value + '0');
		}

		return sumOfTheNumbers;
	}

	/**
	 * Prints the elements of an char array.
	 * 
	 * @param number
	 *            the array
	 */
	public static void printElements(char[] number) {
		System.out.println(number);
	}

}
