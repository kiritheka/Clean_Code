package main.java;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the number");
    int num = scanner.nextInt();
    int factorial = fact(num);
    System.out.println("Factorial of entered number is: "+factorial);
 }
 public static int fact(int n)
 {
     int output;
     if(n==1){
       return 1;
     }
     else if (n<=0)
    	 return 0;
     output = fact(n-1)* n;
     return output;
 }
}
