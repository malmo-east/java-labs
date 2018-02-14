package com.vitalii.procopiuc.lab;
import java.security.SecureRandom;

public class ArrayScores {

	public static void main(String[] args) {
		
		int[] counts = new int[30];
		int[] bestScores = new int[5];
		SecureRandom random = new SecureRandom();
		int a = 0; 
		System.out.println("An array of zeros:");
		for(int i = 0; i < 10;i++) {
			counts[a] = 0;
			System.out.println(a);
		}
		System.out.print("Bonus array: ");
		int bonus = 1+random.nextInt(300);
		
		for(int i = 0; i < 30;i++) {
			if(i%15!=0) {
				continue;
			}
			i+=14;
			counts[i] = bonus;
			System.out.println(bonus);
			
		}
		System.out.println("\nArray bestScores: ");
		for (int i = 0; i < 5; i++) {
			bestScores[i] = random.nextInt(100);

			System.out.printf("%4d \n", bestScores[i]);
		}

	}

}
