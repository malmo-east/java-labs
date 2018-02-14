package com.vitalii.procopiuc.lab;
import java.util.Scanner;

public class Invoice extends InvoiceHandler {
	private static Scanner scan;

	public static void main(String[] args) {
		
		InvoiceHandler invoice = new InvoiceHandler(); 

		scan = new Scanner (System.in); 

		String item; 
		String description; 
		int quantity; 
		double price; 

		System.out.print ("Enter the product code: "); 
		item = scan.nextLine(); 
		invoice.setPartNumber(item); 

		System.out.print ("Enter Product Description: "); 
		description = scan.nextLine(); 
		invoice.setPartDescription(description); 

		System.out.print ("Enter the quantity of the purchased product: "); 
		quantity = scan.nextInt(); 
		if (quantity > 0) 
		invoice.setQuantityOfItemPurchased(quantity); 

		System.out.print ("Enter the price per unit: "); 
		price = scan.nextDouble(); 
		if (price > 0) 
		invoice.setPricePerItem(price); 

		System.out.printf ("Purchase amount = $%.2f\n", 
		invoice.getInvoiceAmount()); 

	}

}
