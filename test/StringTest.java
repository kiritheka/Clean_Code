package main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test   
	  public void appendTest() throws Throwable
	   {
	    StringBuffer object = new StringBuffer("a");
	      object.append("b");
	       assertEquals("ab",object.toString());
	       assertNotSame("ab", object.toString(), "not same");
	       assertNotNull(object.toString());
	    }

}
