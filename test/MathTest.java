package main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import main.java.MathUtil;

class MathTest {

	@Test
	@Tag("odd")
	 public void testIsOdd() {
		assertTrue(!MathUtil.isOdd(2));
		assertTrue(!MathUtil.isOdd(0));
		assertTrue(!MathUtil.isOdd(43567342));
		assertTrue(MathUtil.isOdd(1));
		assertTrue(MathUtil.isOdd(-1));
}
	@Test
	@Tag("log10")
	public void testLog10() {
	assertEquals(2.0, MathUtil.log10(100.0), 0.0000001);
	assertEquals(1.7634279935629373, MathUtil.log10(58.0), 0.0000001);
 }
}