package com.revature.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemoPrepared {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/learndb",
					"root",
					"Qwerty@123456");
			System.out.println(connection.getClass().getName());
			System.out.println("Connection Sucessfull");
			String sql = "insert into department (name) values(?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1,  "Research");
			statement.executeUpdate();
			
			statement.setString(1,  "Develop");
			statement.executeUpdate();
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
