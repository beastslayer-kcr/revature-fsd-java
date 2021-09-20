package com.revature.bankapp.model;

public class Account {

	private String branch;
	private double balance;
	private String first_name;
	private String last_name;
	private long account_num;
	private String email;

	

	public Account(double balance, String branch,  String first_name, String last_name, String email) {
		super();
		this.branch = branch;
		this.balance = balance;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}

	public Account() {
		
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBranch() {
		return branch;
	}




	public void setBranch(String branch) {
		this.branch = branch;
	}




	public Double getBalance() {
		return balance;
	}




	public void setBalance(double balance) {
		this.balance = balance;
	}




	public String getFirst_name() {
		return first_name;
	}




	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}




	public String getLast_name() {
		return last_name;
	}




	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}




	public long getAccount_num() {
		return account_num;
	}




	public void setAccount_num(long account_num) {
		this.account_num = account_num;
	}

	@Override
	public String toString() {
		return "Account [branch=" + branch + ", balance=" + balance + ", first_name=" + first_name + ", last_name="
				+ last_name + ", account_num=" + account_num + "]";
	}

	
	
}
