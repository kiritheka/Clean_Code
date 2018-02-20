package main.java;

public class StringTryCatch {

	public int convertToInt(String str) {
		if (str == null || str.length() == 0) {
			throw new IllegalArgumentException("String must be not null or empty");
		}
		return Integer.valueOf(str);
	}
}
