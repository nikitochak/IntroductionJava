package test;

import org.testng.annotations.Test;

import main.java.com.sirma.itt.javacourse.hangman.*;

/**
 * @author Nikoaly Ch
 * 
 */
public class HangmamTest {
	private int size = (int) (Math.random() * 10 + 5);
	char[] word = new char[size];
	boolean[] guess = new boolean[size];

	/**
	 * Tests the method for generating a word and printing it on the screen.
	 */
	@Test
	public void TestWordGen() {
		Help.wordGen(word, guess, size);
		for (int i = 0; i < size; i++) {
			System.out.print(word[i]);
		}
	}
}
