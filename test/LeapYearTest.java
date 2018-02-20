package main.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.LeapYear;

class LeapYearTest {

	@Test
	public void testisLeapYear() {
		assertFalse(LeapYear.isLeapYear(1995));
		assertTrue(LeapYear.isLeapYear(2004));
		assertEquals(true, LeapYear.isLeapYear(2012));
		assertFalse(LeapYear.isLeapYear(0));
		assertFalse(LeapYear.isLeapYear(-1994));
	}
}
