package main.java;

import java.util.Scanner;

public class VolumeOfCube {
	public static  int calculateCube(int number) {
        if(number>0){
	     int cubic = number*number*number;
         return cubic;  
        }
        else {
       	 return 0;
        }
}

	 public static void main(String args[]){
	    Scanner obj = new Scanner(System.in);
	    System.out.print("Enter the number:");
	    int number = obj.nextInt();
	    System.out.println("volume is: "+ VolumeOfCube.calculateCube(number));
	  }
}
