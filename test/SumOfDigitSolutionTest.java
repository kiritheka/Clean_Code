package main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.SumOfDigitSolution;

class SumOfDigitSolutionTest {
	SumOfDigitSolution sod = new SumOfDigitSolution();

	@Test
	public void testSumOfDigitUsingRecursion() {
		assertEquals(0, sod.sumOfDigit(-9));
		assertSame(17, sod.sumOfDigit(476));
		assertSame(0, sod.sumOfDigit(0));
		assertNotSame(45, sod.sumOfDigit(999));
	}

}
