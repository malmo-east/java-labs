package com.vitalii.procopiuc.lab;
import java.util.Scanner;

public class Number0to100 {
	private static Scanner scan;

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		scan = new Scanner(System.in);
		int f = 0; 
		System.out.println("Enter 5 numbers that enter in the range from 10 to 100 without repetitions: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			
			if (i != 0) {
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {
						while (arr[i] == arr[j]) {
							System.out.print("Your number has already been entered, enter a different number: ");
							arr[i] = scan.nextInt();
						}
					}
				}
			}
		
			if (arr[i] < 10 || arr[i] > 100) {
				do {
					System.out.print("Your number is not between 10 and 100 inclusive. enter another number: ");
					arr[i] = scan.nextInt();
					if (i != 0) {
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {
				while (arr[i] == arr[j]) {
			System.out.print("Your number has already been entered, enter a different number: ");
									arr[i] = scan.nextInt();
					}
				}
			}
		}
					
					if (arr[i] >= 10 && arr[i] <= 100) {
						f = 1; 
					}
				} while (f == 0);
			}
		}
		
		System.out.printf("%s\n", "Your numbers:");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("\t%4d\n", arr[i]);
		}

	}

}
