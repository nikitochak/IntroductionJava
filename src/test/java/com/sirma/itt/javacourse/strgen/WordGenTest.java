package test.java.com.sirma.itt.javacourse.strgen;

import static org.junit.Assert.*;
import main.java.com.sirma.itt.javacourse.strgen.Generator;
import org.junit.Test;

/**
 * Tests the method for generating new word.
 * 
 * @author Nikolay Ch
 * 
 */
public class WordGenTest {

	/**
	 * Tests if a new word is generated.
	 */
	@Test
	public void test() {
		String word = "asdf";
		word = Generator.generate(word);
		if (word.equals("asdf")) {
			fail("Not");
		}
	}

}
