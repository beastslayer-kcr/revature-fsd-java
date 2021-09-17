package com.revature.bankapp.menu;


import java.util.Scanner;
import com.revature.bankapp.form.CustomerRegistrationForm;
import com.revature.bankapp.form.LoginForm;
import com.revature.bankapp.model.Customer;
//import com.revature.bankapp.model.DataManager;

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
			CustomerRegistrationForm cus = new CustomerRegistrationForm("Customer Registration Form");
			cus.captureDataAndPerformAction();
			
			// CustomerDao dao = new CustometDaoImpl();
			// dao.create(new Customer(firstName, lastName, email, password));
			System.out.println("Customer added Sucessfully");
			displayMenuAndCaptureSelection();
			break;

		case 2:

			LoginForm loginForm = new LoginForm("Login Form");
			loginForm.captureDataAndPerformAction();
			displayMenuAndCaptureSelection();
			break;
		
		case 3 : 
			System.out.println("owenfiuwnfdo2nef");
			break;
		}
	}
}
