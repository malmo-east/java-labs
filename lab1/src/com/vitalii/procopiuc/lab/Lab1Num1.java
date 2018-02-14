package com.vitalii.procopiuc.lab;
import java.util.Scanner;

public class Lab1Num1 {
	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		 int num1 = scan.nextInt();
		 System.out.println("Enter the second number: ");
		 int num2 = scan.nextInt();
		if(num1 > num2)
			System.out.println(num1 +" more than "+ num2 + ".");
		if(num1 < num2)
			System.out.println(num2 +" more than "+ num1 + ".");
		if(num1==num2)
			System.out.println("The numbers are equal.");
	}

}
