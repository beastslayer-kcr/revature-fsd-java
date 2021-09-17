package com.revature.bankapp.form;

import java.sql.SQLException; 
import java.util.Scanner;

import com.revature.bankapp.costumerImpl.CustomerDaoImpl;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.DataManager;

public class CustomerRegistrationForm extends Form {

	public CustomerRegistrationForm(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void captureData() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("First Name");
		String firstName = scanner.nextLine();

		System.out.println("Last Name");
		String lastName = scanner.nextLine();

		System.out.println("Email");
		String email = scanner.nextLine();

		System.out.println("Password: ");
		String password = scanner.nextLine();

	//	DataManager.addCustomer(new Customer(firstName, lastName, email, password));
		CustomerDaoImpl customerdao = new CustomerDaoImpl();
		try {
			customerdao.create(new Customer (firstName , lastName , email , password ));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" Customer added Successfully ");

	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		success = true;
	}

}
