package main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.VolumeOfCube;

class VolumeOfCubeTest {

	VolumeOfCube voc = new VolumeOfCube();

	@Test  
	    public void testCalculateCube(){  
	        assertEquals(216,voc.calculateCube(6));
	        assertEquals(0,voc.calculateCube(0));
	        assertNotSame(299,voc.calculateCube(3));
	        assertEquals(0,voc.calculateCube(-6));
	        assertTrue(voc.calculateCube(6) > 6);  
	    } 
}
