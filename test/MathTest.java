package main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import main.java.MathUtil;

class MathTest {
	MathUtil mathUtil = new MathUtil();

	@Test
	@Tag("odd")
	public void testIsOdd() {
		assertTrue(!mathUtil.isOdd(2));
		assertTrue(!mathUtil.isOdd(0));
		assertTrue(!mathUtil.isOdd(43567342));
		assertTrue(mathUtil.isOdd(1));
		assertTrue(mathUtil.isOdd(-1));
	}

	@Test
	@Tag("log10")
	public void testLog10() {
		assertEquals(2.0, mathUtil.log10(100.0), 0.0000001);
		assertEquals(1.7634279935629373, mathUtil.log10(58.0), 0.0000001);
	}
}