package com.vitalii.procopiuc.lab;

public class PiNumber {

	public static void main(String[] args) {
		double Pi = 4;
		int divide = 1;
		int itr=0;
		for (int i = 1; i < 200001; i++) {
			divide += 2;
			if (i % 2 == 0) {
				Pi += 4 / (double) divide;
			}

			else if (i % 2 != 0) {
				Pi -= 4 / (double) divide;
			}
			if((Pi-3.14159>=0.0)&&(itr==0)) {
				itr=i;
			}
			
		}
		System.out.println(+itr + " iteration for the output of the number Pi equal to: "+Pi);
	}

}
