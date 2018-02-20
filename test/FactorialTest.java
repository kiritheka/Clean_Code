package main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import main.java.Factorial;

class FactorialTest {
	Factorial factorial = new Factorial();

	@Test
	public void Testfact() {
		assertNotNull(factorial.fact(7));
		assertEquals(1, factorial.fact(1));
		assertEquals(720, factorial.fact(6));
		assertNotEquals(455, factorial.fact(9));
		assertEquals(0, factorial.fact(-4));
		assertEquals(0, factorial.fact(0));
		assertNotSame(720, factorial.fact(6));
	}
}
