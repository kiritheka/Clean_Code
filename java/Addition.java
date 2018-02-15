package main.java;

import java.util.Scanner;

public class Addition {
	public static int sum(int var1, int var2) {
        System.out.println("Adding two values " + var1 + " + " + var2);
	    return var1 + var2;
     }
	
	public static void main(String args[]){
	    Scanner obj = new Scanner(System.in);
	    System.out.print("Enter the first number:");
	    int var1 = obj.nextInt();
	    System.out.print("Enter the second number:");
	    int var2 = obj.nextInt();
	    System.out.println("value is: "+ Addition.sum(var1, var2));
	  }
}
