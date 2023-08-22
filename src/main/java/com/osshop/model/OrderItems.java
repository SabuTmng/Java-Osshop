/**
 * 
 */
package com.osshop.model;

import java.sql.*;
import java.util.Objects;

/**
 * @author Admin
 *
 */
public class OrderItems {

	private int orderId;
	private int productId;
	private int productQty;
	private int productPrice;
	private Timestamp createdAt;
	private Timestamp updatedAt;

	/**
	 * @return the orderId
	 */
	public int getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
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
	 * @return the productQty
	 */
	public int getProductQty() {
		return productQty;
	}

	/**
	 * @param productQty the productQty to set
	 */
	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	/**
	 * @return the productPrice
	 */
	public int getProductPrice() {
		return productPrice;
	}

	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
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

	@Override
	public int hashCode() {
		return Objects.hash(createdAt, orderId, productId, productPrice, productQty, updatedAt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItems other = (OrderItems) obj;
		return Objects.equals(createdAt, other.createdAt) && orderId == other.orderId && productId == other.productId
				&& productPrice == other.productPrice && productQty == other.productQty
				&& Objects.equals(updatedAt, other.updatedAt);
	}

	@Override
	public String toString() {
		return "OrderItems [orderId=" + orderId + ", productId=" + productId + ", productQty=" + productQty
				+ ", productPrice=" + productPrice + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}

}
