package main.java;

public class MathUtil {

	public static boolean isOdd(int i) {
		if((i%2)!=0) 
			return true;
	    else 
			return false;	
		}
	
	public static double log10(double d) {
		return Math.log10(d);
	}
	
	public static void main(String args[]) {
		System.out.println(isOdd(5));
		System.out.println(log10(435));
	}
 }


