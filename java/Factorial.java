package main.java;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		Factorial fc = new Factorial();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scanner.nextInt();
		System.out.println("Factorial of entered number is: " + fc.fact(num));
	}

	public int fact(int n) {
		if (n == 1) {
			return 1;
		} else if (n <= 0)
			return 0;
		int output = fact(n - 1) * n;
		return output;
	}
}
