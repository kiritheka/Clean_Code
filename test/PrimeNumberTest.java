package main.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.PrimeNumber;

class PrimeNumberTest {
	PrimeNumber primeNumber = new PrimeNumber();

	@Test
	public void testValidate() {
		assertFalse(primeNumber.validate(8));
		assertTrue(primeNumber.validate(5));
		assertEquals(true, primeNumber.validate(19));
		assertNotNull(primeNumber);

	}
}
