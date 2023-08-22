/**
 * 
 */
package com.osshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.osshop.exception.CartNotFoundException;
import com.osshop.exception.ProductNotFoundException;
import com.osshop.model.Cart;

/**
 * @author Admin
 *
 */
public class CartDao {

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1/osshopdb";

	static final String userName = "root";
	static final String userPassword = "";

	public boolean addProductToCart(Cart cart) {

		if (cart == null) {
			throw new IllegalArgumentException("Card object is null");
		}

		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL, userName, userPassword);
			Statement stmt = conn.createStatement();
			String sql = "INSERT INTO `cart`(`cart_id`, `user_id`, `product_id`, `total_quantity`,"
					+ " `created_at`, `updated_at`) VALUES ('" + cart.getCartId() + "','" + cart.getUserId() + "',"
					+ "'" + cart.getProductId() + "','" + cart.getQty() + "',now(),now())";

			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				return true;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	// method to Update Cart
	public boolean updateCart(int cartId) {

		if (cartId <= 0) {
			throw new IllegalArgumentException("Cart ID is Invalid");
		}

		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL, userName, userPassword);

			Statement stmt = conn.createStatement();
			String sql = "UPDATE `cart` SET `product_id` = '1' WHERE `cart`.`cart_id` =" + cartId;

			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				return true;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	public List<Cart> getCartByUserId(int userId) throws CartNotFoundException {

		List<Cart> cartList = new LinkedList<>();

		if (userId <= 0) {
			throw new IllegalArgumentException("Invalid User ID");
		}
		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL, userName, userPassword);
			Statement stmt = conn.createStatement();
			String sql = "SELECT cart_id, user_id,product_id,total_quantity,created_at,updated_at"
					+ " FROM cart WHERE user_id = " + userId;

			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next() == false) {
				throw new CartNotFoundException("The cart of the userId " + userId + " doesn't exist");
			}

			while (rs.next()) {

				int cartId = rs.getInt("cart_id");
				int userID = rs.getInt("user_id");
				int productId = rs.getInt("product_id");
				int qty = rs.getInt("total_quantity");

				Cart cart = new Cart();
				cart.setCartId(cartId);
				cart.setUserId(userID);
				cart.setProductId(productId);
				cart.setQty(qty);

				cartList.add(cart);
			}
			return cartList;

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return cartList;

	}

	public int delete(int cartId) {

		if (cartId <= 0) {
			throw new IllegalArgumentException("CardId is Invalid");
		}

		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL, userName, userPassword);
			Statement stmt = conn.createStatement();
			String sql = "DELETE FROM `cart` WHERE `cart_id` =" + cartId;

			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				return 1;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}