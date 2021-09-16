package com.revature.bankapp.util;

import java.sql.SQLException;

import com.revature.bankapp.model.Customer;

public interface CustomerDao {
	void creat (Customer customer) throws SQLException;
	
	
}
