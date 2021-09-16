package com.revature.bankapp.costumerImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.bankapp.model.Customer;
import com.revature.bankapp.util.CustomerDao;
import com.revature.bankapp.util.Util;

public class CustomerDaoImpl implements CustomerDao{

	@Override
	public void creat(Customer customer) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "INSERT INTO customer ( FirstName , LastName, Email, password) VALUES (? ,?, ? ,?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, customer.getFirstName());
			statement.setString(2, customer.getLastName());
			statement.setString(3, customer.getEmail());
			statement.setString(4, customer.getPassword());
			statement.executeUpdate();
		}

		
	}



		
	



}
