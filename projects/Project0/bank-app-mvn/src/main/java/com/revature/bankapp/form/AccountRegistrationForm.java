package com.revature.bankapp.form;

import java.util.Scanner;

public class AccountRegistrationForm extends Form {

	public AccountRegistrationForm(String name) {
		super(name);
		
	}

	@Override
	public void captureData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the balance");
		double balance = in.nextDouble();
		System.out.println("Enter branch name");
		String branch = in.nextLine();
		in.close();
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		success = true;

	}

}
