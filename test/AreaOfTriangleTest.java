package main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import main.java.AreaOfTriangle;

public class AreaOfTriangleTest {
AreaOfTriangle aot = new AreaOfTriangle();

@Test
@DisplayName("checking validity")
	public void testIs_valid() {
		assertTrue(aot.is_Valid(22, 25, 29));
        assertFalse(aot.is_Valid(66, 88, 11));
        assertFalse(aot.is_Valid(-66, -88, -11));
        assertFalse(aot.is_Valid(66, 0, 11));
	}

@Test
@DisplayName("calculating area")
public void testArea_Triangle() {
		assertEquals(266.7133292507144, aot.area_Triangle(22, 25, 29));
		assertNotSame(994.097879937789, aot.area_Triangle(45, 47, 49));
	}

}
