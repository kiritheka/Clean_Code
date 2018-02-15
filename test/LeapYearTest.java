package main.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.LeapYear;

class LeapYearTest {
	LeapYear leapYear = new LeapYear();
	
	@Test
	public void testisLeapYear() {
		  assertFalse(leapYear.isLeapYear(1995));
		  assertTrue(leapYear.isLeapYear(2004));
		  assertEquals(true, leapYear.isLeapYear(2012));
		  assertFalse(leapYear.isLeapYear(0));
		  assertFalse(leapYear.isLeapYear(-1994));	
	}

}
