package main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterisedTest {

@Test	
 @ParameterizedTest
 @ValueSource(ints = { 1, 2, 3 ,5,9})
	 void testWithValueSource(int argument) {
	     assertNotNull(argument);
	 }


@ParameterizedTest
@ValueSource(strings = {"name", "city", "state", "country"})
 void testWithValueSource(String values) {
	assertNotNull(values);	
}
	

	/*@Rule		
	public ErrorCollector collector = new ErrorCollector();
	
void testWithValueSource() {
try {
		assertNull("dfj");
	}
	catch (Throwable t) {					
        collector.addError(t);
	}
  }*/
}
