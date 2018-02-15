package main.java;

public class StringFunction {

	public static Double convertToDouble(String str) {
	    if (str == null) {
	      return null;
	    }
	    return Double.valueOf(str);
	  }
}
