package com.vitalii.procopiuc.lab;
import java.util.Scanner;

public class Degree {
	private static Scanner scan;
	
	public static int integerDegree(int base, int power) {

		int counter;
		int i;
		i = base;
		counter = 1;
		while (counter < power) {
			counter++;
			base = base * i;
		}
		return base;
	}

	public static void main(String[] args) {
			scan = new Scanner(System.in);
			System.out.print("Enter the base: ");
			int base = scan.nextInt();
			System.out.print("Enter the degree: ");
			int degree = scan.nextInt();
			int p = integerDegree(base, degree);
			System.out.println(p);
	}

}