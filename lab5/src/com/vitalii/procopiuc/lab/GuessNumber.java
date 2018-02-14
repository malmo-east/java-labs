package com.vitalii.procopiuc.lab;

public class GuessNumber {
	
	public static Boolean isPerfect(int x)
    {
        int sum = 0;
        
        for(int i=1;i<x;i++) {
            if (x % i == 0){
                sum+=i;
            }
        }
        return sum==x;
    } 

	public static void main(String[] args) {
		for(int num=2;num<=Integer.MAX_VALUE;num++){
		  if(isPerfect(num)){
			  
		      System.out.println(num + " perfect.");
		      System.out.printf("Constituents of numbers: ");

		      for(int i=1;i<num;i++){
		    	  
		    	  if (num % i == 0){
		    		  System.out.print(i+" ");
		   			}
		    	  
		      }
		       System.out.print("\n");
		   	}
		}

	}

}
