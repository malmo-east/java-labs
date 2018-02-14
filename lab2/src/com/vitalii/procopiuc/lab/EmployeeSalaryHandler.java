package com.vitalii.procopiuc.lab;

public class EmployeeSalaryHandler {
	private String firstName; 
	private String lastName; 
	private double monthlySalary; 

	public void Employee(String nameA, String nameB, double salary) { 
	firstName = nameA; 
	lastName = nameB; 
	monthlySalary = salary; 
	} 

	public void setFirstName(String name) { 
	firstName = name; 
	} 

	public String getFirstName() { 
	return firstName; 
	} 

	public void setLastName(String name) { 
	lastName = name; 
	} 

	public String getLastName() { 
	return lastName; 
	} 

	public void setmonthlySalary(double salary) { 
	monthlySalary = salary; 
	} 

	public double getmonthlySalary() { 
	return monthlySalary; 
	} 

	public double yearlySalary() { 
	double yearlySalary; 
	yearlySalary = (monthlySalary * 12); 
	return yearlySalary; 
	} 

	public double yearlySalaryIncrease() { 
	double yearlySalaryIncrease; 
	yearlySalaryIncrease = (((yearlySalary() * (0.1)) + yearlySalary())); 
	return yearlySalaryIncrease; 
	} 

	public void displayYearlySalary() { 
	System.out.printf("%s %s's Current annual salary $%.2f\n", firstName, lastName, 
	yearlySalary()); 
	} 

	public void displayYearlySalaryIncrease() { 
	System.out.printf("%s %s = $%.2f\n", firstName, lastName, yearlySalaryIncrease()); 
	} 
}
