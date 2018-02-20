package main.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import main.java.StringReverse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import org.junit.jupiter.api.Test;

class StringReverseTest {
	StringReverse stringReverse = new StringReverse();

	@Test
	public void testReverse() {
		assertNotSame("abc", stringReverse.StringReverse("cba").toString());
		assertNotNull(stringReverse.StringReverse("cba"));
		assertEquals(stringReverse.StringReverse("five").toString(), "evif");
		assertEquals(stringReverse.StringReverse("f").toString(), "f");

	}

}
