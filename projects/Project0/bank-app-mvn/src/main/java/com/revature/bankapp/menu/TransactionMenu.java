package com.revature.bankapp.menu;

import java.util.Scanner;

public class TransactionMenu extends Menu{
	public static String accNumber;
	Scanner scanner = new Scanner(System.in);
	public TransactionMenu(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		addMenuItem("Deposit");
		addMenuItem("Withdraw");
	}

	@Override
	void handleAction() {
		// TODO Auto-generated method stub
		
		switch(selection) {
		case 1:
			
			
		}
	}
	public String getAccount() {
		System.out.println("Enter Account number to make transaction: ");
		
		accNumber = scanner.nextLine();
		System.out.println("Account Number: " + accNumber);
		return accNumber;
	}

}
