package main.java;

import java.util.Scanner;

public class LeapYear {

	public static boolean isLeapYear(int year) {
		if (year <= 0)
			return false;
		else if (((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))))
			return true;
		else
			return false;
	}

	public static void main(String[] argv) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the year:");
		int year = obj.nextInt();
		System.out.println("Leap Year: " + LeapYear.isLeapYear(year));

	}

}
