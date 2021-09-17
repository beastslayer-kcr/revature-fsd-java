package com.revature.bankapp.util;

import java.sql.SQLException;

import com.revature.bankapp.model.Customer;

public interface CustomerDao {
	void create(Customer customer) throws SQLException;

	Customer getByEmail(String email) throws SQLException;
	
}
