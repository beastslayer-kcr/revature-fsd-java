package com.revature.bankapp.menu;

import java.util.Scanner;
import com.revature.bankapp.form.LoginForm;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.DataManager;



public class MainMenu extends Menu {

	public MainMenu(String name) {
		super(name);
		addMenuItem("Register new Customer");
		addMenuItem("Login as Customer");
		addMenuItem("Login as Employee");
		addMenuItem("Exit");
	}
	
	@Override
	void handleAction() {
		
	
		Scanner scanner = new Scanner(System.in);
		switch (selection) {
		case 1:
			System.out.println("\n==");
			System.out.println("Register new customer");
			System.out.println("==\n");
			
			System.out.println("First Name");
			String firstName = scanner.nextLine();
			
			System.out.println("Last Name");
			String lastName = scanner.nextLine();
			
			System.out.println("Email");
			String email  = scanner.nextLine();
			
			System.out.println("Password: ");
			String password = scanner.nextLine();
			
			DataManager.addCustomer(new Customer(firstName, lastName, email, password));
			System.out.println("Customer added Sucessfully");
			displayMenuAndCaptureSelection();
			break;
			
		case 2:
			
			LoginForm loginForm  = new LoginForm("Login Form");
			loginForm.captureDataAndPerformAction();
			break;
		}
	}
}
