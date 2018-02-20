package main.java;

public class MathUtil {

	public boolean isOdd(int i) {
		if ((i % 2) != 0)
			return true;
		else
			return false;
	}

	public double log10(double d) {
		return Math.log10(d);
	}

	public static void main(String args[]) {
		MathUtil mathUtil = new MathUtil();
		System.out.println(mathUtil.isOdd(5));
		System.out.println(mathUtil.log10(435));
	}
}
