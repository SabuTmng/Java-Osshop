package com.osshop.model;

import java.sql.*;
import java.util.Objects;

public class Cart {

	private int cartId;
	private int userId;
	private int productId;
	private int qty;
	private Timestamp createdAt;
	private Timestamp updatedAt;

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	/**
	 * The function will return userId
	 * 
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * The method set the userId
	 * 
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return the qty
	 */
	public int getQty() {
		return qty;
	}

	/**
	 * @param qty the qty to set
	 */
	public void setQty(int qty) {
		this.qty = qty;
	}

	/**
	 * @return the createdAt
	 */
	public Timestamp getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return the updatedAt
	 */
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * @param updatedAt the updatedAt to set
	 */
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * @param userId
	 * @param productId
	 * @param qty
	 * @param createdAt
	 * @param updatedAt
	 */
	public Cart(int userId, int productId, int qty, Timestamp createdAt, Timestamp updatedAt) {
		super();
		this.userId = userId;
		this.productId = productId;
		this.qty = qty;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdAt, productId, qty, updatedAt, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		return Objects.equals(createdAt, other.createdAt) && productId == other.productId && qty == other.qty
				&& Objects.equals(updatedAt, other.updatedAt) && userId == other.userId;
	}

	@Override
	public String toString() {
		return "Cart [userId=" + userId + ", productId=" + productId + ", qty=" + qty + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}

	public void addProduct(int productId2) {
		// TODO Auto-generated method stub

	}

	public Cart() {

	}

}
