package com.vitalii.procopiuc.lab;
import java.util.Scanner;

public class FourNumbers {
	private static Scanner scan;
	
	public static boolean isMultiple(int x, int y) {
		if (y % x == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int x = scan.nextInt();
		
		
		System.out.print("Enter second integer: ");
		int y = scan.nextInt();
		boolean z = isMultiple(x, y);
		
		System.out.println(z);
		
		while (x != 0 && y != 0) {
			System.out.print("Enter first integer: ");
			x = scan.nextInt();
			
			System.out.print("Enter second integer: ");
			y = scan.nextInt();
			
			z = isMultiple(x, y);
			System.out.println(z);
		}
	}

}
