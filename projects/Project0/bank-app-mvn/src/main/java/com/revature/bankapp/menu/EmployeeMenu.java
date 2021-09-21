package com.revature.bankapp.menu;

import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.bankapp.costumerImpl.EmployeeDaoImpl;
import com.revature.bankapp.form.AccountRegistrationForm;
import com.revature.bankapp.form.CustomerRegistrationForm;
import com.revature.bankapp.form.LoginForm;
import com.revature.bankapp.model.Account;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.Transaction;
import com.revature.bankapp.util.EmployeeDao;

public class EmployeeMenu extends Menu{

	public EmployeeMenu(String name) {
		super(name);
		addMenuItem("Register for Customer account");
		addMenuItem("Display All Customers");
		addMenuItem("Display All Accounts");
		addMenuItem("Display Transactions");
		
		addMenuItem("Logout");
	}

	@Override
	void handleAction() {
		EmployeeDao edao = new EmployeeDaoImpl();
		switch(selection) {
		case 1:
			CustomerRegistrationForm signUp = new CustomerRegistrationForm("Customer SignUp");
			signUp.captureDataAndPerformAction();
			
			LoginForm loginForm = new LoginForm("Customer Login");
			loginForm.captureDataAndPerformAction();
			
			AccountRegistrationForm createAcc = new AccountRegistrationForm("Account details");
			createAcc.captureDataAndPerformAction();
			
			displayMenuAndCaptureSelection();
			
			break;
		case 2:
			try {
				ArrayList<Customer> acc = (ArrayList<Customer>) edao.viewCustomer();
				acc.forEach(System.out::println);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			displayMenuAndCaptureSelection();
			break;
		case 3:
			try {
				ArrayList<Account> acc = (ArrayList<Account>) edao.viewAccount();
				acc.forEach(System.out::println);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			displayMenuAndCaptureSelection();
			break;
		case 4:
			try {
				ArrayList<Transaction> trans = (ArrayList<Transaction>) edao.viewTransaction();
				trans.forEach(System.out::println);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			displayMenuAndCaptureSelection();
		case 5:
			MainMenu mainmenu = new MainMenu("Main Menu");
			mainmenu.displayMenu();
			break;
		}
		
	}
	
}
