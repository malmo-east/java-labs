package com.vitalii.procopiuc.lab;
import java.util.Scanner;

public class MaxAndMinNumber {
	private static Scanner scan;

	public static void main(String[] args) {
		
		 scan = new Scanner(System.in);
	        int counter;
	        int small = Integer.MAX_VALUE;

	        int start = 0;

	        int number = 0;
	        System.out.print("Enter first numbers: ");
	        start = scan.nextInt();
	        for(counter = 0;counter < start;counter++)
	        {
	            System.out.print("Enter second number: ");

	            number = scan.nextInt();
	            if(number < small)
	            {
	                small = number;
	            }
	        }
	        System.out.printf("The smallest number is: %d\n", small);

	}

}
