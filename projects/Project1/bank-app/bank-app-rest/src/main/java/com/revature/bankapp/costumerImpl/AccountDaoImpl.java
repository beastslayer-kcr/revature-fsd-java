package com.revature.bankapp.costumerImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.revature.bankapp.model.Account;
import com.revature.bankapp.model.Transaction;
import com.revature.bankapp.util.AccountDao;
import com.revature.bankapp.util.Util;

public class AccountDaoImpl implements AccountDao {
	private static int currentAccountId;
	private static int transferAccountId;
	@Override
	public void create(Account account) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "INSERT INTO account (balance, first_name, last_name,branch, email) VALUES (?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setDouble(1, account.getBalance());
			preparedStatement.setString(2, account.getFirst_name());
			preparedStatement.setString(3, account.getLast_name());
			preparedStatement.setString(4, account.getBranch());
			preparedStatement.setString(5, account.getEmail());
			preparedStatement.executeUpdate();

		}

	}

	@Override
	public ArrayList<Account> showAccounts() throws SQLException {
		List<Account> accountList = new ArrayList<>();
		String email = "";
		//String email = BankApp.getCurrentCustomer().getEmail();
		try (Connection connection = Util.getConnection()) {
			String sql = "select * from account where email =?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, email);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Account account = new Account();
				account.setAccount_num(resultSet.getInt("account_num"));
				account.setBalance(resultSet.getDouble("balance"));
				account.setFirst_name(resultSet.getString("first_name"));
				account.setFirst_name(resultSet.getString("last_name"));
				account.setBranch(resultSet.getString("branch"));
				accountList.add(account);

			}
		}
		return (ArrayList<Account>) accountList;
	}

	public void insert(Transaction transaction) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "insert into transaction (type, amount, account_id) values (?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, String.valueOf(transaction.getType()));
			statement.setDouble(2, transaction.getAmount());
			statement.setInt(3, currentAccountId);
			statement.executeUpdate();

		}

	}

	public void update(Account account) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "update account set balance = ? where account_num = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setDouble(1, account.getBalance());
			statement.setInt(2, currentAccountId);
			statement.executeUpdate();
		}
	}

	public Account currentAccount() throws SQLException {
		Account account = null;
		try (Connection connection = Util.getConnection()) {
			String sql = "select * from account where account_num = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			//statement.setString(1, TransactionMenu.accNumber);
			statement.setString(1,"");
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				currentAccountId = resultSet.getInt("account_num");
				int accNumber = resultSet.getInt("account_num");
				long initialAmount = resultSet.getLong("balance");

				account = new Account(initialAmount, accNumber);
			}
		}
		return account;
	}

	public Account transferAccount() throws SQLException {
		Account account = null;
		try (Connection connection = Util.getConnection()) {
			String sql = "select * from account where account_num = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			//statement.setString(1, TransactionMenu.transferAccNum);
			statement.setString(1, "");
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				transferAccountId = resultSet.getInt("account_num");
				int accNumber = resultSet.getInt("account_num");
				long balance = resultSet.getLong("balance");

				account = new Account(balance, accNumber);
			}
		}

		return account;
	}

	public void insertTransfer(Transaction transaction) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "insert into transaction (type, amount, account_id) values (?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, String.valueOf(transaction.getType()));
			statement.setDouble(2, transaction.getAmount());
			statement.setInt(3, transferAccountId);
			statement.executeUpdate();
		}
	}

	public void updateTransfer(Account account) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "update account set balance = ? where account_num = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setDouble(1, account.getBalance());
			statement.setInt(2, transferAccountId);
			statement.executeUpdate();
		}
	}
	
}
