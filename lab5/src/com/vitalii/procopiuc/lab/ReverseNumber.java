package com.vitalii.procopiuc.lab;
import java.util.Scanner;

public class ReverseNumber {
	private static Scanner scan;
	
	public static int Reverse( int x ) { 
		int rvs = 0;
		while( x != 0 ){
			rvs = rvs * 10;
			rvs = rvs + x%10;
			x = x/10;
		}
    return rvs;
}

	public static void main(String[] args) {
		 System.out.println("Enter your number: ");
		 int x = scan.nextInt();
		 int z = Reverse(x); 
		 System.out.println("Reverse number: "+ z);
	}

}
