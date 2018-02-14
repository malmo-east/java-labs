package com.vitalii.procopiuc.lab;
import java.util.Scanner; 

public class Numbers {
	private static Scanner scan;

	public static void main(String[] args) {
		
		int [] arr= new int[10]; 
		System.out.println("Enter 10 numbers: "); 
		arr[0]=scan.nextInt(); 
		for(int i=1;i < arr.length;i++) { 
			arr[i]=scan.nextInt(); 
				for(int x = 0; x<i; x++) { 
					if(arr[i]==arr[x]) { 
						System.out.println("This number already exists, enter a different number"); 
							arr[i]=scan.nextInt(); 

					} 
				} 
		} 
		
		scan.close(); 
		
		int buffer = 0; 
		for(int i=0;i<arr.length;i++) { 
			for(int l = 0;l<arr.length;l++) { 
				if(arr[i]<arr[l]) { 
					buffer=arr[i]; 
					arr[i]=arr[l]; 
					arr[l]=buffer; 
				} 
			} 
		} 

		System.out.println("The largest numbers: \nFirst - "+arr[9]+"\nSecond- "+arr[8]); 

	}

}
