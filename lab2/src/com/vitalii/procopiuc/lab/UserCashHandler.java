package com.vitalii.procopiuc.lab;

public class UserCashHandler {
	public double balance; 

	public void UserProfileCash (double initialBalance) { 
		if (initialBalance > 0.0) 
			balance = initialBalance; 
		} 

	public void credit (double amount) { 
		balance = balance + amount; 
	} 

	public double getBalance() { 
		return balance; 
	} 

	public void Withdraw (double amount) { 
		if (amount > balance) 
			System.out.printf ("Current balance: \n"); 
		if (amount == balance) 
			balance = balance - amount; 
		if (amount < balance) 
			balance = balance - amount; 
	} 
}
