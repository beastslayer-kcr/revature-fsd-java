package com.revature.bankapp.model;

public class Account {

	private String branch;
	private Double balance;

	public Account(String banch, Double balance) {
		super();
		this.branch = banch;
		this.balance = balance;
	}

	public String getBanch() {
		return branch;
	}

	public void setBanch(String banch) {
		this.branch = branch;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [banch=" + branch + ", balance=" + balance + "]";
	}
}
