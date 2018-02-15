package main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.Employee;

class EmployeeTest {

	Employee emp = new Employee();

	@Test
	  public void testCalculateYearlySalary() {
	  assertNotNull(emp.calculateYearlySalary(23000));
	  assertEquals(12000,emp.calculateYearlySalary(1000));
	  assertEquals(0,emp.calculateYearlySalary(-1000));
	  assertNotSame(15000,emp.calculateYearlySalary(2600));
	}

	@Test
	  public void testEmployeeAgeCheck() {
	 assertTrue(emp.employeeAgeCheck(29));
	 assertFalse(emp.employeeAgeCheck(15));
	 assertFalse(emp.employeeAgeCheck(-22));
	 assertFalse(emp.employeeAgeCheck(0));
	}
}
