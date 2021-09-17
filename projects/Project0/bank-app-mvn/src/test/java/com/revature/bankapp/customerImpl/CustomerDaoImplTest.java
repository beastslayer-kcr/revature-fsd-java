package com.revature.bankapp.customerImpl;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.revature.bankapp.costumerImpl.CustomerDaoImpl;
import com.revature.bankapp.model.Account;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.util.CustomerDao;

class CustomerDaoImplTest {

	@Test
	void test() {
		CustomerDaoImpl customerDao = new CustomerDaoImpl();
		try {
			customerDao.create(new Customer("DASAf", "fgasf", "hafgsd", "4GHFYf"));
		} catch (SQLException e) {
			fail("Customer Not Entered Properly");
		}

	}

	@Test
	void testGet_Success() {
		CustomerDao dao = new CustomerDaoImpl();
		try {
			Customer customer = dao.getByEmail("xyz@123");
			assertEquals("Amit", customer.getFirstName(), "Incorrect user returned.");
		} catch (SQLException e) {
			e.printStackTrace();
			fail("Getting employee list failed.");
		}
	}

	@Test
	void test1() {
		CustomerDaoImpl customerDaoImpl = new CustomerDaoImpl();
		Account account = new Account();
		account.setBalance(6000.00);
		account.setFirst_name("Chandra");
		account.setLast_name("xyz");
		account.setBranch("Gurgoan");
		try {
			customerDaoImpl.create(account);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Getting employee list failed.");
		}
	}

}
