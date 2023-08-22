package com.osshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.osshop.model.Order;
import com.osshop.model.OrderItems;

public class OrderDao {

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1/osshopdb";

	static final String userName = "root";
	static final String userPassword = "";

	// method to add order
	public boolean addOrder(Order order) {

		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL, userName, userPassword);

			Statement stmt = conn.createStatement();
			String sql = "INSERT INTO `order` (`user_id`, `total_cost`, "
					+ "`order_number`, `payment_method_id`, `order_status`, `created_at`, " + "`updated_at`) VALUES ('"
					+ order.getUserId() + "', '" + order.getTotalCost() + "'," + "'" + order.getOrderNumber() + "','"
					+ order.getPaymentMethodId() + "', " + "'" + order.getOrderStatus() + "', now(), now())";

			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				return true;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return false;

	}

//method to update order
	public boolean updateOrder(Order order) {

		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL, userName, userPassword);

			Statement stmt = conn.createStatement();
			String sql = "UPDATE `order` SET `order_number` = '636445' WHERE `order`.`order_ID` =" + order.getOrderId();

			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				return true;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return false;

	}

//method to delete order	
	public boolean deleteOrderByOrderId(int orderId) {

		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL, userName, userPassword);

			Statement stmt = conn.createStatement();
			String sql = "DELETE FROM `order` WHERE order_id =" + orderId;

			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				return true;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	// method to get Order by Order number
	public Order getOrderByOrderNumber(String orderNumber) {
		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL, userName, userPassword);

			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM `order` WHERE order_number = '" + orderNumber + "'";

			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {
				int orderId = rs.getInt("order_id");
				int userId = rs.getInt("user_id");
				int totalCost = rs.getInt("total_cost");
				int paymentMethodId = rs.getInt("payment_method_id");
				int orderStatus = rs.getInt("order_status");
				// Extract other order details as needed

				Order order = new Order();
				order.setOrderId(orderId);
				order.setUserId(userId);
				order.setTotalCost(totalCost);
				order.setPaymentMethodId(paymentMethodId);
				order.setOrderStatus(orderStatus);
				// Set other order details as needed

				return order;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	// method to get order by userId
	public List<Order> getOrderByUserId(int userId) {
		List<Order> orders = new LinkedList<>();

		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL, userName, userPassword);

			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM `order` WHERE user_id = " + userId;

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int orderId = rs.getInt("order_id");
				int totalCost = rs.getInt("total_cost");
				String orderNumber = rs.getString("order_number");
				int paymentMethodId = rs.getInt("payment_method_id");
				int orderStatus = rs.getInt("order_status");
				// Extract other order details as needed

				Order order = new Order();
				order.setOrderId(orderId);
				order.setUserId(userId);
				order.setTotalCost(totalCost);
				order.setOrderNumber(orderNumber);
				order.setPaymentMethodId(paymentMethodId);
				order.setOrderStatus(orderStatus);
				// Set other order details as needed

				orders.add(order);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return orders;
	}

	/**
	 * Get the order items by given order id
	 * 
	 * @param orderId an orderId
	 * @return List of OrdersItems
	 */
	public List<OrderItems> getOrderItemsByOrderId(int orderId) {
		List<OrderItems> orderItems = new LinkedList<>();

		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL, userName, userPassword);

			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM order_items WHERE order_id = " + orderId;

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int orderItemId = rs.getInt("order_item_id");
				int id = rs.getInt("orderId");
				int productId = rs.getInt("productId");
				int productQty = rs.getInt("productQty");
				int productPrice = rs.getInt("productPrice");

				OrderItems item = new OrderItems();
				item.setOrderId(orderItemId);
				item.setOrderId(id);
				item.setProductId(productId);
				item.setProductQty(productQty);
				item.setProductPrice(productPrice);

				orderItems.add(item);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return orderItems;
	}
}
