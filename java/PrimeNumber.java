package main.java;

import java.util.Scanner;

public class PrimeNumber {

	public Boolean validate(int primeNumber) {

		for (int i = 2; i < (primeNumber / 2); i++) {
			if (primeNumber % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		PrimeNumber PrimeNumber = new PrimeNumber();
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the number:");
		int number = obj.nextInt();
		System.out.println("Prime Number: " + PrimeNumber.validate(number));
	}
}
