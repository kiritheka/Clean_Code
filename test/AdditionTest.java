package main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.Addition;

class AdditionTest {

	Addition add = new Addition();
	
	  int actualValue =add.sum(8, 9);
	  int expectedValue = 17;
	  
@Test
	public void testSum() {  
	    assertNotNull(add.sum(55, 7));
	    assertEquals(actualValue ,expectedValue);
	    assertEquals(1, add.sum(9, -8));
	    assertEquals(-4, add.sum(7, -11));
	}

}
