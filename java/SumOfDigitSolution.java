package main.java;
import java.util.Scanner;

public class SumOfDigitSolution {
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
		   if (number <= 0) {
		    return sum;
		   }
		   sum += number % 10;
		    return sumOfDigitUsingRecursion(number / 10, sum);
		  }
}
