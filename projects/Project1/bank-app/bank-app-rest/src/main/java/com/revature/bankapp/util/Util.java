package com.revature.bankapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
	public static Connection getConnection() throws  SQLException {

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} 
	
	 return DriverManager.getConnection("jdbc:mysql://localhost:3306/bank" ,
			"root",
			"Qwerty@123456");
}
}
