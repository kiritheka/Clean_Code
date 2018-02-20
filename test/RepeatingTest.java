package main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import main.java.Addition;
import main.java.MathUtil;

class RepeatingTest {
	Addition addition = new Addition();
	MathUtil mathUtil = new MathUtil();

	@RepeatedTest(value = 5, name = "Addition CHECK {currentRepetition}/{totalRepetitions}")
	public void testAdding() {
		assertEquals(1, addition.sum(9, -8));
		assertEquals(-4, addition.sum(7, -11));
		assertNotNull(addition.sum(55, 7));
		assertNotSame(67, addition.sum(24, 6));
	}

	@RepeatedTest(value = 3, name = "Odd CHECK {currentRepetition}/{totalRepetitions}")
	public void testIsOdd() {
		assertTrue(!mathUtil.isOdd(2));
		assertTrue(!mathUtil.isOdd(0));
		assertTrue(!mathUtil.isOdd(43567342));
		assertTrue(mathUtil.isOdd(1));
		assertTrue(mathUtil.isOdd(-1));
	}
}
