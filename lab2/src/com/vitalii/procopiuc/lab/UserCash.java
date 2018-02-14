package com.vitalii.procopiuc.lab;
import java.util.Scanner; 

public class UserCash extends UserCashHandler{
	public static Scanner scan; 

	public static void main(String[] args) {
		
		UserCashHandler account = new UserCashHandler(); 

		scan = new Scanner (System.in); 

		System.out.printf ("Your current balance: $%.2f\n\n", account.getBalance()); 

		System.out.printf ("Enter the amount to add: "); 
		float depositAmount = (float) scan.nextDouble(); 

		System.out.printf ("\n Added money %.2f to your account\n\n", depositAmount); 
		account.credit(depositAmount); 

		System.out.printf ("Account balance: $%.2f\n\n", account.getBalance()); 

		System.out.printf ("Enter the amount to be withdrawn: "); 
		float debitAmount = (float) scan.nextDouble(); 

		System.out.printf ("\nDiscontinued %.2f from your account \n\n", debitAmount); 
		account.Withdraw(debitAmount); 

		System.out.printf ("Account balance: $%.2f\n\n", account.getBalance()); 

	}

}
