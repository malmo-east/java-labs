package com.vitalii.procopiuc.lab;
import java.util.Scanner;

public class CreditLimit {
	private static Scanner scan;

	public static void main(String[] args) {
		
		int accountNumber; 
        int balance;  
        int totalItems; 
        int totalCredits;  
        int allowedCreditLimit; 
 
        scan = new Scanner(System.in);
 
        System.out.println("Who the department store customers has exceeded the credit limit on the account.\n");
 
        System.out.println("Enter the customer account number: ");
        accountNumber = scan.nextInt();
 
        System.out.println();
 
        System.out.println("Enter the client's balance at the beginning of the month: ");
        balance = scan.nextInt();
 
        System.out.println();
 
        System.out.println("Enter how many total purchases were registered by the buyer this month: ");
        totalItems = scan.nextInt();
 
        System.out.println();
 
        System.out.println("Enter how many credits were used by the buyer for this month: ");
        totalCredits = scan.nextInt();
 
        System.out.println();
 
        System.out.println("Enter the limit on the customers credit card: ");
        allowedCreditLimit = scan.nextInt();
 
        System.out.println();
 
        int newBalance = balance + totalItems - totalCredits;
 
        System.out.println("Customer: " + accountNumber + "\n"
                + "Balance at the beginning of the month: " + balance + "\n"
                + "Total purchases this month: " + totalItems + "\n"
                + "Number of credits used: " + totalCredits + "\n");
 
        System.out.println("New balance of the customer: " + newBalance + "$");
 
        System.out.println();
 
        if (newBalance < allowedCreditLimit) {
            System.out.println("Credit limit exceeded");
        }
 
        System.out.println();

	}

}
