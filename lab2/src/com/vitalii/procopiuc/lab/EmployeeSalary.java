package com.vitalii.procopiuc.lab;
import java.util.Scanner; 

public class EmployeeSalary extends EmployeeSalaryHandler {
	private static Scanner scan; 

	public static void main(String[] args) {
		
		EmployeeSalaryHandler employee1 = new EmployeeSalaryHandler(); 
		EmployeeSalaryHandler employee2 = new EmployeeSalaryHandler(); 

		scan = new Scanner(System.in); 

		String firstName; 
		String lastName; 
		float monthlySalary; 

		System.out.println("Enter the first employee's data:\n"); 

		System.out.print("Enter first name: "); 
		firstName = scan.next(); 
		employee1.setFirstName(firstName); 
		employee1.getFirstName(); 
		System.out.print("Enter last name: "); 
		lastName = scan.next(); 
		employee1.setLastName(lastName); 
		employee1.getLastName(); 
		System.out.print("Enter the monthly salary: "); 
		monthlySalary = scan.nextFloat(); 
		if (monthlySalary > 0) 
		employee1.setmonthlySalary(monthlySalary); 
		employee1.getmonthlySalary(); 

		System.out.println(); 

		System.out.println("Enter the data of the second employee:\n"); 

		System.out.print("Enter first name: "); 
		firstName = scan.next(); 
		employee2.setFirstName(firstName); 
		employee2.getFirstName(); 
		System.out.print("Enter last name: "); 
		lastName = scan.next(); 
		employee2.setLastName(lastName); 
		employee2.getLastName(); 
		System.out.print("Enter the monthly salary: "); 
		monthlySalary = scan.nextFloat(); 
		if (monthlySalary > 0) 
			employee2.setmonthlySalary(monthlySalary); 
			employee2.getmonthlySalary(); 

		System.out.println(); 

		employee1.yearlySalary(); 
		employee2.yearlySalary(); 

		employee1.displayYearlySalary(); 

		System.out.println(); 

		employee2.displayYearlySalary(); 

		System.out.println(); 

		employee1.yearlySalaryIncrease(); 
		employee2.yearlySalaryIncrease(); 

		System.out.printf("\nNew annual salary:\n\n", employee1.getFirstName(), 
		employee1.getLastName(), employee2.getFirstName(), 
		employee2.getLastName(), '%'); 

		employee1.displayYearlySalaryIncrease(); 

		System.out.println(); 

		employee2.displayYearlySalaryIncrease(); 

	}

}
