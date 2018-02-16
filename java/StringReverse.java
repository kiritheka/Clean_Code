package main.java;

import java.util.Scanner;

public class StringReverse {

    public Object reverse(String str)
    {
        if ((str==null)||(str.length() <= 1))
           System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
		return str;
    }

    public static void main(String[] args) 
    {
    	Scanner scn = new Scanner(System.in);
	    System.out.print("Enter the String:");
	    String str = scn.next();
        StringReverse obj = new StringReverse();
        obj.reverse(str);
    }  

}
