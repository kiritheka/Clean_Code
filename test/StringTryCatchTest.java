package main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import main.java.StringTryCatch;

class StringTryCatchTest {

	@Test
	public void testConvertToInt() {
		StringTryCatch stringTryCatch = new StringTryCatch();
		String st = "";
		try {
			stringTryCatch.convertToInt(st);
			fail("Expected an IllegalArgumentException to be thrown");
		} catch (IllegalArgumentException e) {
			assertEquals("String must be not null or empty", e.getMessage());
		}
	}
}
