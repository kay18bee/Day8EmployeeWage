package com.bridgelabz.employeewageproblem;

public class EmployeeWageUC6 {
	
	public static void main(String[] args) {
	
		EmployeeWageUC5 empWageBuilder = new EmployeeWageUC5();
		int totalEmpWage = empWageBuilder.monthlyWage();
		System.out.println("Total monthly wage is: " + totalEmpWage);
	}
}
