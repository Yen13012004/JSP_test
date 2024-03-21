package dao;

import java.util.List;

import entities.Account;

public interface AccountDAO {
	public List<Account> getAccount();
	public boolean insertAccount(Account a);
	public Account getAccountById(Integer id);
	public boolean updateAccount(Account a);
	public boolean deleteAccount(Integer id);
}
