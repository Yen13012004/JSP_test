package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DBUtility;
import entities.Account;

public class AccountDAOImpl implements AccountDAO{

	@Override
	public List<Account> getAccount() {
		List<Account> list = new ArrayList();
		
		Connection con;
		PreparedStatement pstmt;
		ResultSet rs;
		
		con = DBUtility.getConnection();
		try {
			pstmt = con.prepareStatement("Select * from Account");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Account a = new Account();
				a.setId(rs.getInt("Id"));
				a.setPassword(rs.getString("Password"));
				a.setFullName(rs.getString("FullName"));
				a.setGender(rs.getBoolean("Gender"));
				a.setBirthday(rs.getDate("Birthday"));
				a.setAddress(rs.getString("Address"));
				a.setEmail(rs.getString("Email"));
				a.setPhone(rs.getString("Phone"));
				list.add(a);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtility.closeConnection(con);
		}
		return list;
	}

	@Override
	public boolean insertAccount(Account a) {
		boolean bl = false;
		
		Connection con;
		PreparedStatement pstmt;
		con = DBUtility.getConnection();
		try {
			pstmt = con.prepareStatement("INSERT INTO Account values (?,?,?,?,?,?,?)");
			pstmt.setString(1, a.getPassword());
			pstmt.setString(2, a.getFullName());
			pstmt.setBoolean(3, a.getGender());
			pstmt.setDate(4, new Date(a.getBirthday().getTime()));
			pstmt.setString(5, a.getAddress());
			pstmt.setString(6, a.getEmail());
			pstmt.setString(7, a.getPhone());
			int i = pstmt.executeUpdate();
			if(i>0)
				bl = true;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			DBUtility.closeConnection(con);			
		}
		
		return bl;
	}

	@Override
	public boolean updateAccount(Account a) {
		boolean bl = false;
		
		Connection con;
		PreparedStatement pstmt;
		con = DBUtility.getConnection();
		try {
			pstmt = con.prepareStatement("update Account set FullName=?, Gender=?, Birthday=?, Address=?, Email=?, Phone=? where Id=?");
			pstmt.setString(1, a.getFullName());
			pstmt.setBoolean(2, a.getGender());
			pstmt.setDate(3, new Date(a.getBirthday().getTime()));
			pstmt.setString(4, a.getAddress());
			pstmt.setString(5, a.getEmail());
			pstmt.setString(6, a.getPhone());
			pstmt.setInt(7, a.getId());
			int i = pstmt.executeUpdate();
			if(i>0)
				bl = true;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			DBUtility.closeConnection(con);			
		}
		
		return bl;
	}

	@Override
	public Account getAccountById(Integer id) {
		Account a = null;
		
		Connection con;
		PreparedStatement pstmt;
		ResultSet rs;
		
		con = DBUtility.getConnection();
		try {
			pstmt = con.prepareStatement("Select * from Account Where Id = ?");
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				a = new Account();
				a.setId(rs.getInt("Id"));
				a.setPassword(rs.getString("Password"));
				a.setFullName(rs.getString("FullName"));
				a.setGender(rs.getBoolean("Gender"));
				a.setBirthday(rs.getDate("Birthday"));
				a.setAddress(rs.getString("Address"));
				a.setEmail(rs.getString("Email"));
				a.setPhone(rs.getString("Phone"));				
			}
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}finally {
			DBUtility.closeConnection(con);
		}
		
		return a;
	}

	@Override
	public boolean deleteAccount(Integer id) {
		boolean bl = false;
		
		Connection con;
		PreparedStatement pstmt;
		con = DBUtility.getConnection();
		try {
			pstmt = con.prepareStatement("Delete from Account Where Id = ?");
			pstmt.setInt(1, id);
			int i = pstmt.executeUpdate();
			if(i>0)
				bl = true;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			DBUtility.closeConnection(con);			
		}
		
		return bl;
		

	}

	

}
