package com.vitalii.procopiuc.lab;
import java.util.Scanner;

public class MaxAndMinNumbers {
	private static Scanner input;
	
	public static float minimum3(float first, float second, float third) {
		float min;
		min = first;
		if (min > second)
			min = second;
		if (min > third)
			min = third;
		return min;
	}

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		float x = input.nextInt();
		System.out.println("Enter second number: ");
		float y = input.nextInt();
		System.out.println("Enter third number: ");
		float z = input.nextInt();
		float smallest = minimum3(x, y, z);
		System.out.println(smallest);

	}

}
