package main.test;

import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.Test;

class ArrayTest {
	int[] expectedArray = {1,3,5,7,9,11};
	 int[] actualArray = {1,3,5,7,9,11};
	 
@Test
	 public void EqualsTest() {
	  assertArrayEquals("both array are equal" ,expectedArray ,actualArray);
   }
 }
	
