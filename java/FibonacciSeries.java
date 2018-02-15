package main.java;
import java.util.Scanner;

public class FibonacciSeries {   
		 static int number1=0,number2=1,number3=0;   
		 public static int printFibonacci(int count){ 
		 if (count <= 0)
				return 0;   
		    else
		         number3 = number1 + number2;    
		         number1 = number2;    
		         number2 = number3;    
		         System.out.print(" "+number3);   
		         return printFibonacci(count-1);    
		     }           
	 public static void main(String args[]){    
		 Scanner obj = new Scanner(System.in);
		 System.out.print("Enter the count:");
	     int count = obj.nextInt();    
		 System.out.print(number1+" "+number2);
	  printFibonacci(count-2);   
	 }  
}
