
package com.revature.bankapp.menu;

import java.util.Scanner;

import com.revature.bankapp.form.AccountRegistrationForm;

public class CustomerMainMenu extends Menu {

	public CustomerMainMenu(String name) {
		super(name);
		addMenuItem("Create new account");
		addMenuItem("View Accounts");
		addMenuItem("Logout");
		
		displayMenuAndCaptureSelection();
	}
	
	@Override
	void handleAction() {
		Scanner in  = new Scanner(System.in);
		
		switch(selection) {
		case 1:
			AccountRegistrationForm accountRegistrationForm = new AccountRegistrationForm("New Account registartion form");
			accountRegistrationForm.captureDataAndPerformAction();
			displayMenuAndCaptureSelection();
			break;
			case  3:
				System.out.println("You have loged out Sucessfully");
		}
	}

}
