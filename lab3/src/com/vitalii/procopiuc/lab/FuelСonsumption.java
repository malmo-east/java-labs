package com.vitalii.procopiuc.lab;
import java.util.Scanner;

public class Fuel—onsumption {
	private static Scanner scan;

	public static void main(String[] args) {
		
		
		int miles;  
	    int gallons;
	    int totalMiles = 0;
	    int totalGallons = 0;
	 
	    scan = new Scanner(System.in); 
	 
	    System.out.println(" Counts and displays"
	                		+ " miles per gallon for each trip and displays."
	                		+ " combined miles per gallon for all trips.\n");
	    miles = scan.nextInt();
	         
	    while (miles != -1 ) {            
	    	System.out.println("Enter the used gallons: ");
	        gallons = scan.nextInt();
	        System.out.println("\nMiles traveled for this trip: " + miles);
	        System.out.println("Gallons used for this trip: " + gallons);
	        totalMiles += miles;
	        totalGallons += gallons;
	        System.out.printf("\nMiles per gallon for this trip: %f\nCombined "
	                    	+ "per gallon: %f\n",(double)miles/gallons, (double)totalMiles/totalGallons);
	        miles = scan.nextInt();
	    }
	        System.out.println();
	        
	}

}
