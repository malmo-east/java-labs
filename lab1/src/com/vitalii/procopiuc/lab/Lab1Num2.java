package com.vitalii.procopiuc.lab;
import java.util.Scanner;

public class Lab1Num2 {
	
	private static Scanner scan;

	public static void main (String [] args) {
				       
	scan = new Scanner (System.in);
				         
	int numA,
	    numB,
	    numC;
	int sumABC; 
	int average;
	int product;
	int smallest;
	int largest;
				         
	System.out.print ("Enter first number: ");
	numA = scan.nextInt ();
	System.out.print ("Enter second number: ");
	numB = scan.nextInt ();
	System.out.print ("Enter third number: ");
	numC = scan.nextInt ();
				         
	sumABC = numA + numB + numC;
	average = (numA + numB + numC)/3;
	product = numA * numB * numC;
				         
	smallest = numA; 
	if (numB < smallest)
		smallest = numB;
	if (numC < smallest)
		smallest = numC;
				         
	largest = numA; 
	if (numB > largest)
		largest = numB;
	if (numC > largest)
		largest = numC;
				         
	System.out.printf ("\nSum = %d\nAverage = %d\nProduct = %d\nSmallest = %d\n"
		+ "Largest = %d\n", sumABC, average, product, smallest, largest);
	}
}
