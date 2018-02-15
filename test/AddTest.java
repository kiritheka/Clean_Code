package main.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddTest {
	double fValue1;
    double fValue2;

@BeforeEach
protected void setUp(){
    fValue1= 2.12;
    fValue2= 3.26;
 }

@Test
public void testAdd() {
       double result= fValue1 + fValue2;
       assertEquals(result ,5.38,0.02);
   }

@AfterEach
protected void tearDown() throws Exception {
    fValue1= 0.0;
    fValue2= 0.0;
 }

}
