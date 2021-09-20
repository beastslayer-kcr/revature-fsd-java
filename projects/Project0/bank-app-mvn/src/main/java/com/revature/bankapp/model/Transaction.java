package com.revature.bankapp.model;

import java.sql.SQLException;

import com.revature.bankapp.costumerImpl.AccountDaoImpl;

public class Transaction {
	private int customerId;
	private String name;
	private String accountNumber;
	private double initialAmount;
	private int accountId;
	private char type;
	private double amount;
	private boolean success = true;
	AccountDaoImpl accdao = new AccountDaoImpl();
	public Transaction(char type, double amount) {
		this.type = type;
		this.amount = amount;
	}
	
	public Transaction() {
		
	}
	

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getInitialAmount() {
		return initialAmount;
	}

	public void setInitialAmount(double initialAmount) {
		this.initialAmount = initialAmount;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String print() {
		return "Type: " + type + "  Amount: "+ amount;
	}
/*
	public double withdraw(double withdrawAmount) {
		while (success) {
//			System.out.println("Enter amount: ");
//			double withdrawAmount = sc.nextDouble();
			if (withdrawAmount < 0) {
				System.out.println("Enter Amount greater than 0");
			} else if (withdrawAmount <= initialAmount) {
				initialAmount -= withdrawAmount;
				success = false;
				try {
					accdao.insert(new Transaction('D', withdrawAmount));
					accdao.update(this);
					System.out.println("Successfull");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Insufficient funds");
			}

		}
		return initialAmount;
	}
	*/
/*
	public double deposit(double depositAmount) {
		while (success) {
			if (depositAmount < 0) {
				System.out.println("Enter Amount greater than 0");
			} else {
				initialAmount += depositAmount;
				success = false;
				try {
					accdao.insert(new Transaction('C', depositAmount));
					accdao.update(this);
					System.out.println("Successfull");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return initialAmount;
	}
	*/
}
