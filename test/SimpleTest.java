package main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SimpleTest {
	int Value1 = 56;
	int Value2 = 65;
	String str = "simple test case";

	@Test
	public void testAdd() {
		assertTrue(Value1 < Value2);
		assertNotSame(Value1, Value2);
		assertNotNull(str);
	}
}
