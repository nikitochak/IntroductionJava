package test;

import org.testng.annotations.Test;
import main.java.com.sirma.itt.javacourse.methodsarray.*;


public class MethodsArrayTest {
 
@Test 
  
  
  public void TestgetMinElementOfArray() {
	  Help meth=new Help();
	  for(int i=0;i<10;i++){
		  meth.Array[i]=i;
	  }
	  System.out.println(meth.getMinElement(meth.Array));
  }
  @Test
  public void TestGetSumOfArray(){
	  Help meth=new Help();
	  for(int i=0;i<10;i++){
		  meth.Array[i]=i;
	  }
	  System.out.println(meth.getSum(meth.Array));
  }
  
  @Test
  public void TestrpintArray(){
	  Help meth=new Help();
	  for(int i=0;i<10;i++){
		  meth.Array[i]=i;
	  }
	  meth.printArray(meth.Array);
  }
}
