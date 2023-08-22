package com.osshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import com.osshop.model.Category;

public class CategoryDao {

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1/osshopdb";

	static final String userName = "root";
	static final String userPassword = "";

//Method to Add Category
	public boolean addCategory(Category category) {

		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL, userName, userPassword);

			Statement stmt = conn.createStatement();
			String sql = "INSERT INTO `category` (`category_name`, `parent_category_id`, "
					+ "`category_status`, `creation_date`, `last_update_date`) VALUES ('" + category.getCategoryName()
					+ "'," + "'" + category.getParentCategoryId() + "','" + category.getStatus() + "', now(), now())";

			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				return true;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return false;

	}

//Method to Delete Category	
	public boolean deleteCategory(int categoryId) {

		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL, userName, userPassword);

			Statement stmt = conn.createStatement();
			String sql = "DELETE FROM `product` WHERE category_id =" + categoryId;

			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				return true;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

//method to Update Category
	public boolean updateCategory(int categoryId) {
		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL, userName, userPassword);

			Statement stmt = conn.createStatement();
			String sql = "UPDATE `category` SET `category_status` = '0' WHERE `category`.`category_id` =" + categoryId;

			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				return true;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

//Method to get Category by Parent category Id
	public boolean getCategoryByCategoryParentId(Category parentCategoryId) {
		ResultSet rs;

		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL, userName, userPassword);

			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM category where parent_category_id = parentCategoryId;";
			rs = stmt.executeQuery(sql);

			LinkedList<Category> categoryList = new LinkedList<>();

			while (rs.next()) {

				int categoryId = rs.getInt("category_id");
				String categoryName = rs.getString("category_name");
				int parentCatId = rs.getInt("parent_category_id");
				int categoryStatus = rs.getInt("category_status");

				Category category = new Category();
				category.setCategoryId(categoryId);
				category.setCategoryName(categoryName);
				category.setParentCategoryId(parentCatId);
				category.setStatus(categoryStatus);

				categoryList.add(category);

			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return false;

	}

}