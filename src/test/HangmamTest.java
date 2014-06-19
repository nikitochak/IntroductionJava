package test;

import org.testng.annotations.Test;

import main.java.com.sirma.itt.javacourse.hangman.*;
public class HangmamTest {
	private int size=(int) (Math.random()*10+5);
	char[] word=new char[size];
	boolean[] guess=new boolean[size];
	
  @Test
  public void TestWordGen() {
	  Help.wordGen(word,guess,size);
	  for(int i=0;i<size;i++){
		  System.out.print(word[i]);
	  }
	  }
}
