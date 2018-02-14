package com.vitalii.procopiuc.lab;
import java.util.Scanner;

public class Lab1Num4 {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		 scan = new Scanner (System.in);
        
		        float curPopulation; 
		        float growthRate;
		        float anIncrease;
		        float estPopulation;
		         
		        System.out.print ("Enter the current world population: ");
		        curPopulation = scan.nextLong();
		        System.out.print ("Enter the annual population increase: ");
		        growthRate = scan.nextInt();
		        anIncrease = (growthRate / 100) * curPopulation;
		        estPopulation = curPopulation + anIncrease;
		 
		        System.out.println ();
		 
		        System.out.println("Expected population in a year:     " + estPopulation);
		        System.out.println("Expected population after 2 years:    " + estPopulation + (anIncrease * 2));
		        System.out.println("Expected population after 3 years:  " + estPopulation + (anIncrease * 3));
		        System.out.println("Expected population after 4 years:   " + estPopulation + (anIncrease * 4));
		        System.out.println("Expected population after 5 years:   " + estPopulation + (anIncrease * 5));

	}

}
