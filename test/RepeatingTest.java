package main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import main.java.Addition;
import main.java.MathUtil;

class RepeatingTest {
	
@RepeatedTest(value = 5, name = "Addition CHECK {currentRepetition}/{totalRepetitions}")
 public void testAdding() {
		assertEquals(1, Addition.sum(9, -8));
	    assertEquals(-4, Addition.sum(7, -11));
	    assertNotNull(Addition.sum(55, 7));
        assertNotSame(67, Addition.sum(24, 6));
	}

@RepeatedTest(value = 4, name = "Odd CHECK {currentRepetition}/{totalRepetitions}")
 public void testIsOdd() {
	assertTrue(!MathUtil.isOdd(2));
	assertTrue(!MathUtil.isOdd(0));
	assertTrue(!MathUtil.isOdd(43567342));
	assertTrue(MathUtil.isOdd(1));
	assertTrue(MathUtil.isOdd(-1));
  }
}
