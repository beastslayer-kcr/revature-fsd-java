package com.revature.bankapp.main;

import java.util.Scanner;

import com.revature.bankapp.menu.MainMenu;
import com.revature.bankapp.model.Customer;

//import com.revature.bankapp.menu.CustomerMainMenu;
public class BankApp {
	 private static Scanner scanner = new Scanner(System.in); 
	 private static Customer currentCustomer;
	public static void main(String[] args) {
		MainMenu menu = new MainMenu("Main Menu");
		menu.displayMenuAndCaptureSelection();

	}
	
	  public static Scanner getScanner() { return scanner; }

	public static Customer getCurrentCustomer() {
		return currentCustomer;
	}

	public static void setCurrentCustomer(Customer currentCustomer) {
		BankApp.currentCustomer = currentCustomer;
	}
	 
	
}
