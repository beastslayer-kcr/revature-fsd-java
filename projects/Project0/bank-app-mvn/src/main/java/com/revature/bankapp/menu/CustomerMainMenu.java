
package com.revature.bankapp.menu;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.revature.bankapp.costumerImpl.AccountDaoImpl;
import com.revature.bankapp.form.AccountRegistrationForm;
import com.revature.bankapp.model.Account;

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
		Scanner in = new Scanner(System.in);

		switch (selection) {
		case 1:
			AccountRegistrationForm accountRegistrationForm = new AccountRegistrationForm("New Account registartion form");
			accountRegistrationForm.captureDataAndPerformAction();
			displayMenuAndCaptureSelection();
			break;
		case 2:
			AccountDaoImpl adao = new AccountDaoImpl();
			try {
				ArrayList<Account >account = adao.showAccounts();
				account.forEach(System.out::println);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			displayMenuAndCaptureSelection();
			break;
		case 3:
			System.out.println("You have loged out Sucessfully");
			break;
		}
	}

}
