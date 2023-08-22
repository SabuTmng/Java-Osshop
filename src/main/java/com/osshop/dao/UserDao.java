/**
 * 
 */
package com.osshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.osshop.exception.InvalidLoginException;
import com.osshop.exception.UserNotFoundException;
import com.osshop.model.User;

/**
 * @author Marline
 *
 */
public class UserDao {

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1/osshopdb";

	static final String userName = "root";
	static final String userPassword = "";

	public boolean create(User user) {

		if (user == null) {
			throw new IllegalArgumentException("User object is Null");
		}

		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL, userName, userPassword);
			Statement stmt = conn.createStatement();
			String sql = "INSERT INTO `user` (`first_name`, `last_name`, `phone_no`, `email`, `password`, "
					+ "`address_line_1`, `address_line_2`, `city`, `state_id`, `zip_code`, `country`, "
					+ "`user_type`, `status`, `profile_photo`) VALUES" + "('" + user.getFirstName() + " ', '"
					+ user.getLastName() + "', '" + user.getPhoneNo() + "', '" + user.getEmail() + "', " + "md5('"
					+ user.getPassword() + "'), '" + user.getAddressLine1() + "', " + "'" + user.getAddressLine2()
					+ "', '" + user.getCity() + "', " + user.getStateId() + ", " + user.getZipCode() + ", " + "'"
					+ user.getCountry() + "', '" + user.getUserType() + "', " + user.getStatus() + ", " + "'"
					+ user.getProfilePhoto() + "')";
			// System.out.println(sql);

			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				return true;

			}
			System.out.println("the value of rs is " + rs);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return false;
		}
		return false;

	}

	public boolean login(String username, String password) throws InvalidLoginException {

		if (username == null) {
			throw new IllegalArgumentException("Username is Invalid");
		}

		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL, userName, userPassword);
			Statement stmt = conn.createStatement();
			String sql = "select email, password from User where email='" + username + "' AND password=md5('" + password
					+ "')";

			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {
				return true;
			} else {
				throw new InvalidLoginException("Invalid Username Or Password");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
}
