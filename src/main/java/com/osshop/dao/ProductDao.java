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

import com.osshop.exception.ProductNotFoundException;
import com.osshop.model.Product;

public class ProductDao {

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1/osshopdb";

	static final String userName = "root";
	static final String userPassword = "";

	List<Product> getProductsByKeyword(String keyword) {

		if (keyword == null) {
			throw new IllegalArgumentException("Keyword cannot bee null");
		}

		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL, userName, userPassword);
			Statement stmt = conn.createStatement();

			String sql = "SELECT category_id, product_name, product_price, product_status, discount_coupon_id, "
					+ "description, product_image_path, qty FROM product WHERE product_name LIKE '%" + keyword + "%' "
					+ "OR description LIKE '%" + keyword + "%'";

			// System.out.println(sql);

			ResultSet rs = stmt.executeQuery(sql);

			LinkedList<Product> productList = new LinkedList<>();

			while (rs.next()) {
				int catId = rs.getInt("category_id");
				String productName = rs.getString("product_name");
				int productPrice = rs.getInt("product_price");
				int productStatus = rs.getInt("product_status");
				int discountCouponId = rs.getInt("discount_coupon_id");
				String description = rs.getString("description");
				String productImagePath = rs.getString("product_image_path");
				int qty = rs.getInt("qty");

				Product product = new Product();
				product.setCategoryId(catId);
				product.setProductName(productName);
				product.setProductPrice(productPrice);
				product.setProductStatus(productStatus);
				product.setDiscountCouponId(discountCouponId);
				product.setDescription(description);
				product.setProductImagePath(productImagePath);
				product.setQty(qty);

				productList.add(product);

			}

			return productList;

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		List<Product> PrdList = new LinkedList<>();
		return PrdList;
	}

	List<Product> getProductByCategoryId(int categoryId) {

		if (categoryId < 0) {
			throw new IllegalArgumentException("Invalid Category ID");
		}
		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL, userName, userPassword);
			Statement stmt = conn.createStatement();
			String sql = "SELECT category_id, product_name, product_price, product_status,"
					+ " discount_coupon_id, description, product_image_path," + " qty FROM product WHERE category_id="
					+ categoryId;


			ResultSet rs = stmt.executeQuery(sql);
			LinkedList<Product> productList = new LinkedList<>();

			while (rs.next()) {
				int catId = rs.getInt("category_id");
				String productName = rs.getString("product_name");
				int productPrice = rs.getInt("product_price");
				int productStatus = rs.getInt("product_status");
				int discountCouponId = rs.getInt("discount_coupon_id");
				String description = rs.getString("description");
				String productImagePath = rs.getString("product_image_path");
				int qty = rs.getInt("qty");

				Product product = new Product();
				product.setCategoryId(catId);
				product.setProductName(productName);
				product.setProductPrice(productPrice);
				product.setProductStatus(productStatus);
				product.setDiscountCouponId(discountCouponId);
				product.setDescription(description);
				product.setProductImagePath(productImagePath);
				product.setQty(qty);

				productList.add(product);

			}

			return productList;

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		List<Product> prdList = new LinkedList<>();
		return prdList;
	}

	List<Product> getProductByProductId(int productId) throws ProductNotFoundException {

		if (productId <= 0) {
			throw new IllegalArgumentException("Invalid Product ID");
		}

		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL, userName, userPassword);
			Statement stmt = conn.createStatement();
			String sql = "SELECT category_id, product_name, product_price, product_status, discount_coupon_id,"
					+ " description, product_image_path, qty FROM product WHERE product_id =" + productId;

			// System.out.println(sql);

			ResultSet rs = stmt.executeQuery(sql);
			LinkedList<Product> productList = new LinkedList<>();

			if (rs.next() == false) {
				throw new ProductNotFoundException("The ProductId " + productId + " doesn't exist");
			}

			while (rs.next()) {
				int catId = rs.getInt("category_id");
				String productName = rs.getString("product_name");
				int productPrice = rs.getInt("product_price");
				int productStatus = rs.getInt("product_status");
				int discountCouponId = rs.getInt("discount_coupon_id");
				String description = rs.getString("description");
				String productImagePath = rs.getString("product_image_path");
				int qty = rs.getInt("qty");

				Product product = new Product();
				product.setCategoryId(catId);
				product.setProductName(productName);
				product.setProductPrice(productPrice);
				product.setProductStatus(productStatus);
				product.setDiscountCouponId(discountCouponId);
				product.setDescription(description);
				product.setProductImagePath(productImagePath);
				product.setQty(qty);

				productList.add(product);

			}

			return productList;

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		List<Product> productList = new LinkedList<>();
		return productList;
	}

	public boolean delete(int productId) {
		return false;

	}

	public int update(Product product) {

		if (product == null) {
			throw new IllegalArgumentException("Product is Null");
		}

		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL, userName, userPassword);
			Statement stmt = conn.createStatement();
			String sql = "UPDATE `product` SET `product_name` = '" + product.getProductName() + "', `description` = '"
					+ product.getDescription() + "'" + " ,`product_image_path` = '" + product.getProductImagePath()
					+ "'" + ",`qty` = '" + product.getQty() + "' WHERE `product`.`product_id` = "
					+ product.getProductId();

			int rs = stmt.executeUpdate(sql);

			if (rs != 0) {
				return 1;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return 1;

	}

	public boolean add(Product product) {
		
		if(product == null) {
			throw new IllegalArgumentException("Product cannot be Null");
		}
		
		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL, userName, userPassword);
			Statement stmt = conn.createStatement();
			String sql = "INSERT INTO `product`(`product_id`, `category_id`, `product_name`, `product_price`, "
					+ "`product_status`, `discount_coupon_id`, `description`, `product_image_path`, `qty`) "
					+ "VALUES ('" + product.getProductId() + "','" + product.getCategoryId() + "','"
					+ product.getProductName() + "'" + ",'" + product.getProductPrice() + "','"
					+ product.getProductStatus() + "','" + product.getDiscountCouponId() + "'," + "'"
					+ product.getDescription() + "','" + product.getProductImagePath() + "','" + product.getQty()
					+ "')";

			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				return true;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return false;

	}
}