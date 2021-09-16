package com.revature.bankapp.customerImpl;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.revature.bankapp.costumerImpl.CustomerDaoImpl;
import com.revature.bankapp.model.Customer;

class CustomerDaoImplTest {

	@Test
	void test() {
		CustomerDaoImpl customerDao = new CustomerDaoImpl();
		try {
			customerDao.creat(new Customer("DASAf" , "fgasf" , "hafgsd" , "4GHFYf"));
		} catch (SQLException e) {
			fail("Customer Not Entered");
		}

	}

}
