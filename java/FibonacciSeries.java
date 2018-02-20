package main.java;

import java.util.Scanner;

public class FibonacciSeries {
	int number1 = 0, number2 = 1, number3 = 0;

	public int printFibonacci(int count) {
		if (count <= 0)
			return 0;
		else
			number3 = number1 + number2;
		number1 = number2;
		number2 = number3;
		System.out.print(" " + number3);
		return printFibonacci(count - 1);
	}

	public static void main(String args[]) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		Scanner resou = new Scanner(System.in);
		System.out.print("Enter the count:");
		int count = resou.nextInt();
		System.out.print(fibonacciSeries.number1 + " " + fibonacciSeries.number2);
		fibonacciSeries.printFibonacci(count - 2);
	}
}
