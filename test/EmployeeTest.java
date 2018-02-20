package main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.Employee;

class EmployeeTest {

	//Employee emp = new Employee();

	@Test
	  public void testCalculateYearlySalary() {
	  assertNotNull(Employee.calculateYearlySalary(23000));
	  assertEquals(12000,Employee.calculateYearlySalary(1000));
	  assertEquals(0,Employee.calculateYearlySalary(-1000));
	  assertNotSame(15000,Employee.calculateYearlySalary(2600));
	}

	@Test
	  public void testEmployeeAgeCheck() {
	 assertTrue(Employee.employeeAgeCheck(29));
	 assertFalse(Employee.employeeAgeCheck(15));
	 assertFalse(Employee.employeeAgeCheck(-22));
	 assertFalse(Employee.employeeAgeCheck(0));
	}
}
