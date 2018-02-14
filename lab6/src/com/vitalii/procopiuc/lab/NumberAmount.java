package com.vitalii.procopiuc.lab;

public class NumberAmount {

	public static void main(String[] args) {
		
		double sum = 0;
		int x = 0;
		int[] array = new int[args.length];
		
			for (int counter = 0; counter < array.length; counter++) {
				sum += Double.parseDouble(args[x]);
				x++;
			}
			
		System.out.printf("Total = %f", sum);
			
	}

}
