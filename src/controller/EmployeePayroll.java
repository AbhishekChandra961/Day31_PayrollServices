package controller;

import java.util.Scanner;

import model.EmployeePayrollPojo;

public class EmployeePayroll {

	private static Scanner userInput = new Scanner(System.in);
	
	public static EmployeePayrollPojo getDetails() {
		EmployeePayrollPojo employeePojo = new EmployeePayrollPojo();
		
		System.out.println("Enter Employee Name");
		employeePojo.setEmployeeName(userInput.next());
	
		return employeePojo;
	}
}
