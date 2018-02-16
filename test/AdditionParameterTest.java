package main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ErrorCollector;


public class AdditionParameterTest {
	 @Rule		
	    public ErrorCollector collector = new ErrorCollector();							

	    @Test		
	    public void example() {					
	    collector.addError(new Throwable("There is an error in first line"));							
	    collector.addError(new Throwable("There is an error in second line"));							

	        					
	        try {			
	            Assert.assertTrue("A " != "o");					
	        } catch (Throwable t) {					
	            collector.addError(t);					
	        }		
	       				
	    }		
	
}
