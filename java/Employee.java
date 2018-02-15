package main.java;

import java.util.Scanner;

public class Employee {
	public static  int calculateYearlySalary(int empSalary) {
        if(empSalary>0){
	     int yearlySalary = empSalary * 12;
        return yearlySalary;  
        }
        else {
       	 return 0;
        }
}
	 
 public static boolean employeeAgeCheck(int empAge) {
	if (empAge>18)
	  return true;
	else 
         return false;
}
	 
public static void main(String[] args) {
   Scanner obj = new Scanner(System.in);
   System.out.print("Enter the employeeName:");
   String empName = obj.next();     
   System.out.print("Enter the employeeAge:");
   int empAge = obj.nextInt(); 
   System.out.print("Enter the employeeSalary:");
   int empSalary = obj.nextInt(); 
  
   System.out.println(employeeAgeCheck(empAge) ? empName + " Yearly Salary is " + calculateYearlySalary(empSalary) : " underAged Employee not allowed" );
 }
}
