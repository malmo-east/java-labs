package com.vitalii.procopiuc.lab;

public class Dimension {

	public static void main(String[] args) {
		int dim = 0;
		
		if (args.length != 0) {
			dim = Integer.parseInt(args[0]);
		}
		else{
			System.out.printf("the dimension is: 10\n"); 
			dim = 10;
		}
		
		int[] array = new int[dim]; 
		System.out.printf("%s%8s%n", "Index", "Value"); 
		
		for (int counter = 0; counter < array.length; counter++)
				System.out.printf("%5d%8d%n", counter, array[counter]);

	}

}
