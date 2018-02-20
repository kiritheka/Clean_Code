package main.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

import main.java.FibonacciSeries;

class FibonacciSeriesTest {
	FibonacciSeries fibonacciSeries = new FibonacciSeries();

	@Test
	public void testPrintFibonacci() {
		assertEquals(0, fibonacciSeries.printFibonacci(0));
		assertNotNull(fibonacciSeries.printFibonacci(3));
	}
}
