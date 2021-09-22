package com.revature.bankapp.costumerImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.bankapp.model.Account;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.util.AccountDao;
import com.revature.bankapp.util.CustomerDao;
import com.revature.bankapp.util.Util;

public class CustomerDaoImpl implements CustomerDao{

	@Override
	public void create(Customer customer) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "INSERT INTO customer ( FirstName , LastName, Email, Password) VALUES (? ,?, ? ,?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, customer.getFirstName());
			statement.setString(2, customer.getLastName());
			statement.setString(3, customer.getEmail());
			statement.setString(4, customer.getPassword());
			statement.executeUpdate();
		}

	}

	@Override
	public Customer getByEmail(String email) throws SQLException {
		try (Connection connection = Util.getConnection()) {

			String sql = "SELECT * FROM customer where email= ? ";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, email);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				Customer customer = new Customer();
				customer.setId(resultSet.getInt("id"));
				customer.setFirstName(resultSet.getString("FirstName"));
				customer.setLastName(resultSet.getString("LastName"));
				customer.setEmail(resultSet.getString("Email"));
				customer.setPassword(resultSet.getString("password"));

				return customer;
			}
		}
		
		return null;

	}

	
		
	}


