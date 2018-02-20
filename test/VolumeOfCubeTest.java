package main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.VolumeOfCube;

class VolumeOfCubeTest {

	@Test
	public void testCalculateCube() {
		assertEquals(216, VolumeOfCube.calculateCube(6));
		assertEquals(0, VolumeOfCube.calculateCube(0));
		assertNotSame(299, VolumeOfCube.calculateCube(3));
		assertEquals(0, VolumeOfCube.calculateCube(-6));
		assertTrue(VolumeOfCube.calculateCube(6) > 6);
	}
}
