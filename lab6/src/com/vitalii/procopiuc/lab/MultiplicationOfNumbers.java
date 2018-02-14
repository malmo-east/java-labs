package com.vitalii.procopiuc.lab;

public class MultiplicationOfNumbers {
	
	public static int product(int...numbers) {
		int res=1;
		
		for(int i=0;i<numbers.length;i++) {
			res*=numbers[i];
		}
		
		return res;
}

	public static void main(String[] args) {
		
		int var1=11;
		int var2=25;
		int var3=30;
		int var4=49;
		int var5=51;
		int var6=62;
		 System.out.printf("var1 = %d    var2 = %d  var3 = %d\nvar4 = %d    var5 = %d   var6 = %d%n", var1, var2, var3, var4,var5,var6);

				 System.out.printf("The product of all numbers: %d%n",product(var1,var2,var3,var4,var5));
				 System.out.printf("The product of the first 3 numbers: %d%n",product(var1, var2,var3));
				 System.out.printf("The product of random numbers in order: %d%n",product(var5, var2,var6));
				 
	}

}
