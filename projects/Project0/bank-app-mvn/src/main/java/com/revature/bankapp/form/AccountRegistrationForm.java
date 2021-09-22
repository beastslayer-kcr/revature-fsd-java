package com.revature.bankapp.form;

import static org.junit.Assert.fail;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.bankapp.costumerImpl.AccountDaoImpl;
import com.revature.bankapp.costumerImpl.CustomerDaoImpl;
import com.revature.bankapp.main.BankApp;
import com.revature.bankapp.model.Account;
import com.revature.bankapp.util.AccountDao;

public class AccountRegistrationForm extends Form {
	private String branch;
	private double balance;
	private String first_name;
	private String last_name;
	private String email;

	public AccountRegistrationForm(String name) {
		super(name);

	}

	@Override
	public void captureData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the balance");
		balance = scanner.nextDouble();
		System.out.println("Enter branch name");
		branch = scanner.next();
		System.out.println("Enter your First Name : ");

		first_name = scanner.next();
		System.out.println("Enter your Last name : ");
		last_name = scanner.next();

		System.out.println("enter email id");
		email = scanner.next();

		System.out.println("Account Creat Sucessfully...");

	}

	@Override
	public void action() {

		AccountDaoImpl accountDaoImpl = new AccountDaoImpl();

		try {
			accountDaoImpl.create(new Account(balance, branch, first_name, last_name, email));
		} catch (SQLException e) {

			e.printStackTrace();
			fail("Getting employee list failed.");
		}
		success = true;

	}

}
