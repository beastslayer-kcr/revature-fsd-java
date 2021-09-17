package com.revature.bankapp.util;

import java.sql.SQLException;

import com.revature.bankapp.model.Account;

public interface AccountDao {
	void create(Account account) throws SQLException;
}
