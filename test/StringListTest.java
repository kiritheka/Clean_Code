package main.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class StringListTest {

	@Test
	public void comparisonTest() {
		List<String> actual = Arrays.asList("a", "b", "c");
		List<String> expected = Arrays.asList("a", "b", "c");

		assertLinesMatch(expected, actual);
		assertEquals(expected, actual);
	}
}
