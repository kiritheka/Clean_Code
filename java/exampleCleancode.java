                                  EXAMPLE PROGRAMS OF CLEAN CODE


//test
import org.junit.*;

 public class SumOfDigitsTest {

@Test
 public void 




//code
import java.util.Scanner;
public class Dgtsum
{
  public static void main(String args[])

    {
       int j, k = 0;

       Scanner s = new Scanner(System.in);

       System.out.print("Enter the number:");

       int i = s.nextInt();//number entered by use

         while(i> 0)

          {
             j = i % 10;

             k = k + j;

             i = i / 10;
          }

           System.out.println("Sum of Digits:"+k);

     }

  }

//re-factored code with better naming conventions and formatting of code

  import java.util.Scanner;

   public class SumOfDigits {
       public static void main(String args[]){
           int number, lastdigit, sum = 0;
           Scanner obj = new Scanner(System.in);
           System.out.print("Enter the positive number:");
           number = obj.nextInt();

           while(number > 0){
               lastdigit = number%10;
               sum = sum + lastdigit;
               number = number/10;
           }
           System.out.println("Sum of Digits:"+sum);
       }
   }








//test

import org.junit.*;

 public class TriangleTest {
 AreaOfTriangle aot = new  AreaOfTriangle();

@Test  
    public void is_ValidTest(){ 
    double side = aot.is_Valid;
        assertTrue((side.side1 + side.side2) > side.side3);  
        assertTrue((side.side2 + side.side3) > side.side1);  
        assertTrue((side.side1 + side.side3) > side.side2);
        assertNotNull(side.side1); 
        assertNotNull(side.side2);    
        assertNotNull(side.side3);       
 }  

@Test  
    public void area_TriangleTest(){
    double ar = aot.area_Triangle;
        assertNotNull(ar.area);
        assertNotNull(ar.s);
}


//code
import java.util.Scanner;
public class Triangle
 {
  public static void main(String[] args)
{
   Scanner in = new Scanner(System.in);
   System.out.print("Input Side-a: ");
   double a = in.nextDouble();
   System.out.print("Input Side-b: ");
   double b = in.nextDouble();
   System.out.print("Input Side-c: ");
   double c = in.nextDouble();
 System.out.println( "The area of the triangle is " + areaoftriangle(a, b, c));
}
   public static double areaoftriangle(double a, double b, double c)
 {
        double area;
        double s = (a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
 }

}

//re-factored code with better functions

import java.util.Scanner;

public class AreaOfTriangle {
  public static void main(String[] args){
        Scanner in = new Scanner(System.in);
         System.out.print("Input Side-1: ");
         double side1 = in.nextDouble();
         System.out.print("Input Side-2: ");
         double side2 = in.nextDouble();
         System.out.print("Input Side-3: ");
         double side3 = in.nextDouble();
         System.out.println(is_Valid(side1, side2,side3) ?
                "The area of the triangle is " + area_Triangle(side1, side2, side3) : "Invalid triangle" );
    }

  public static boolean is_Valid(double side1, double side2, double side3) {
        if(side1 + side2 > side3 &&
           side2 + side3 > side1 &&
           side1 + side3 > side2) return true;
        else return false;
    }
   public static double area_Triangle(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
        return area;
    }
}




//simple test
import org.junit.Test;

public class SimpleTest extends TestCase  {
  int Value1=56;
  int Value2=65;
  String str = "simple test case";
  
 @Test
   public void testAdd() {
     assertTrue (Value1 < Value2);
     assertNotNull(Value1);
     assertNotEqual(value1,value2);
     assertNotNull(str);
   }

	
import org.junit.Test;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(SimpleTest.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result.wasSuccessful());
   }
}






//code

import java.util.Scanner;

public class SumOfDigits {
 int sum = 0;

 public int getNumberSum(int number){
   if(number < 0){
      return 0;
   } else {
      sum += (number%10);
      getNumberSum(number/10);
   }
      return sum;
   }
     
 public static void main(String args[]) {
    SumOfDigits sod = new SumOfDigits();
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the number:");
    int number = obj.nextInt();

    System.out.println("Sum is: "+sod.getNumberSum(number));
  }
}



//TEST CASE

import org.junit.*;

public class EmployeeTest {
Employee emp = new Employee();

@Test
  public void salaryTest() {
  assertNotNull(emp.empSalary);
  assertEquals(12000,emp.calculateYearlySalary(1000));
}

@Test
@Ignore
  public void ageTest() {
  assertTrue(emp.empAge>18);
}

@Test
@Ignore
  public void nameTest() {
  assertNotNull(emp.empName);
}



import org.junit.*;

public class TestRun {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(EmployeeTest.class);

      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result.wasSuccessful());
   }
}  	


//code

import java.util.Scanner;

public class Employee {
  
  public static double calculateYearlySalary(int empSalary) {
           double yearlySalary = empSalary * 12;
           return yearlySalary;
         
   }
   
   public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      System.out.print("Enter the empSalary:");
      String empName = obj.next();
       int empSalary = obj.nextInt();      
       int empAge = obj.nextInt(); 
       System.out.print(" the empSalary:" + calculateYearlySalary(empSalary));
 }
}


//test

import org.junit.Test;

public class VolumeOfCubeTest {
 VolumeOfCube voc = new VolumeOfCube();

@Test  
    public void testCube(){  
        assertEquals(216,voc.cube(6));
        assertTrue(voc.cube(6) > 6);  
    } 


//code

import java.util.Scanner;

public class VolumeOfCube { 

  public static int cube(int number){  
     return number*number*number;  
    }  

 public static void main(String args[]){
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the number:");
    int number = obj.nextInt();
    System.out.println("volume is: "+VolumeOfCube.cube(number));
  }
}



/home/linuxuser/eclipse/java-oxygen







//test
public class AdditionTest {
Addition add = new Addition();
  int actualValue =add.sum(6,1);
  int expectedValue = 7;
  
@Test
public void sumTest() {  
    assertNotNull(expectedValue);
    assertEquals(actualValue ,expectedValue);
}

//code
public class Addition {
    public int sum(int var1, int var2) {
        System.out.println("Add two values " + var1 + " + " + var2);
	    return var1 + var2;
     }
 }



//test (parameterised test)
public class PrimeNumberTest {

@DataProvider(name = "test")
   PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker();
   public static Object[][] primeNumbers() {
      return new Object[][] {{2, true}, {6, false}, {19, true}};
   }

@Test(dataProvider = "test")
   public void primeNumberCheckerTest(Integer inputNumber, Boolean expectedResult) {    
       assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
   }
}


//code
public class PrimeNumber {
   public Boolean validate(int primeNumber) {
   
      for (int i = 2; i < (primeNumber / 2); i++) {
         if (primeNumber % i == 0) {
            return false;
         }
      }
      return true;
   }
}





//test
public class StringListTest {

    @Test
    public void assertListTest {
        List<String> actual = Arrays.asList("a", "b", "c");
        List<String> expected = Arrays.asList("a", "b", "c");

        assertThat(actual, is(expected));
        assertThat(actual, hasItems("c"));
        assertThat(actual.size(), is(3));
        assertThat(actual, containsInAnyOrder("c", "a", "b"));

   }
 }



//test (assertArrayEquals)

public class ArrayTest {
 int[] expectedArray = {1,3,5,7,9,11};
 int[] actualArray = {1,3,5,7,9,11};
 
@Test
 public void EqualsTest() {
  assertArrayEquals("both array are equal" ,expectedArray ,actualArray);
 }
}



//test with exception type
 
public class ExceptionTest {

    @Test(expected = ArithmeticException.class)
    public void testWithException() {
        int i = 1 / 0;
    }
 }




//test case for string buffer
public class StringTest extends TestCase {
 
@Test   
  public void appendTest() throws Throwable
   {
    StringBuffer object = new StringBuffer("a");
      object.append("b");
       assertEquals("both string are equal" ,"ab",object.toString());
    }
}



//test with setup() and teardown()
public class AdditionTest extends TestCase {
     double fValue1;
     double fValue2;

@BeforeClass
protected void setUp() throws Exception {
     fValue1= 2.12;
     fValue2= 3.26;
  }

 @Test
public void testAdd() {
        double result= fValue1 + fValue2;
        assertTrue(result ,5.38,0.02);
    }
 
@AfterClass
protected void tearDown() throws Exception {
     fValue1= 0.0;
     fValue2= 0.0;
  }
 }


//test with timeout function

public class TimeoutTest {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);

    @Test
    public void testSlowSleep() throws InterruptedException {
      
        TimeUnit.sleep(5000);
    }
}








//test

import org.junit.Test;

public class Testing{
  
  @Test
  public void sumOfDigit(){
  assertEquals(6, SumOfDigitSolution.sumOfDigit(123));
  assertEquals(46, SumOfDigitSolution.sumOfDigit(Integer.MAX_VALUE));
  assertEquals(0, SumOfDigitSolution.sumOfDigit(0));
  assertEquals(-6, SumOfDigitSolution.sumOfDigit(-123));
  assertEquals(-47, SumOfDigitSolution.sumOfDigit(Integer.MIN_VALUE));
  
  }
}

//code
import java.util.Scanner;
class SumOfDigitSolution {

  public static void main(String args[]) {
     Scanner obj = new Scanner(System.in);
           System.out.print("Enter the positive number:");
          int number = obj.nextInt();
     System.out.printf("Sum of digit of number is :" + sumOfDigit(number));
}
 public static int sumOfDigit(int input){
  return sumOfDigitUsingRecursion(input, 0);
  }
 
 private static int sumOfDigitUsingRecursion(int number, int sum) {
   if (number == 0) {
    return sum;
   }
   sum += number % 10;
    return sumOfDigitUsingRecursion(number / 10, sum);
  }
}

