package com.vitalii.procopiuc.lab;
import java.util.Scanner;

public class SellersCount {
	public static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int totalSellers = 0;
		 
		System.out.println("Enter number of sellers:");
		totalSellers=scan.nextInt();
	
		double salers[]=new double[totalSellers];	
		int seller1=0, 
			seller2=0, 
			seller3=0, 
			seller4=0, 
			seller5=0, 
			seller6=0, 
			seller7=0, 
			seller8=0, 
			seller9=0;
			
			System.out.println("Enter a seller salary:");
			
			double salary=scan.nextInt();
			for(int i=0;i<totalSellers;i++) {
				salers[0]=scan.nextInt();
				 salary=salers[i]*0.09+200;
				
			if(salary>=200 && salary<300) {
				seller1++;
				}
		    if(salary>=300 && salary<400) {
				seller2++;
				}
		    if(salary>=400 && salary<500) {
				seller3++;
				}
			 if(salary>=500 && salary<600) {
				seller4++;
				}
			 if(salary>=600 && salary<700) {
				seller5++;
				}
			 if(salary>=700 && salary<800) {
				seller6++;
				}
			 if(salary>=800 && salary<900) {
				seller7++;
				}
			 if(salary>=900 && salary<1000) {
				seller8++;
				}
			 if(salary>=1000 ) {
				seller9++;
			 	}
			}
			
			System.out.printf("Earned           Amount"
					+ "\n" +
					"$200–299%15d\n" + 
					"$300–399%15d\n" + 
					"$400–499%15d\n" + 
					"$500–599%15d\n" + 
					"$600–699%15d\n" + 
					"$700–799%15d\n" + 
					"$800–899%15d\n" + 
					"$900–999%15d\n" + 
					"$1,000 and over%8d",seller1,seller2,seller3,seller4,seller5,seller6,seller7,seller8,seller9);

	}

}
