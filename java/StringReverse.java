package main.java;

import java.util.Scanner;

public class StringReverse {

	public StringBuffer StringReverse(String str) {
		StringBuffer buffer = new StringBuffer(str);
		if ((str == null))
			System.out.println("null not allowed");
		else
			return buffer.reverse();
		return buffer;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the String:");
		String str = scn.next();
		StringReverse obj = new StringReverse();
		System.out.println(obj.StringReverse(str));
	}

}
