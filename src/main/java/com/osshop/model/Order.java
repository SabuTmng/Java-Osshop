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
public class Order {

	private int orderId;
	private int userId;
	private float totalCost;
	private String orderNumber;
	private int paymentMethodId;
	private int orderStatus;

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the totalCost
	 */
	public float getTotalCost() {
		return totalCost;
	}

	/**
	 * @param totalCost the totalCost to set
	 */
	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	/**
	 * @return the orderNumber
	 */
	public String getOrderNumber() {
		return orderNumber;
	}

	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * @return the paymentMethodId
	 */
	public int getPaymentMethodId() {
		return paymentMethodId;
	}

	/**
	 * @param paymentMethodId the paymentMethodId to set
	 */
	public void setPaymentMethodId(int paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}

	/**
	 * @return the orderStatus
	 */
	public int getOrderStatus() {
		return orderStatus;
	}

	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
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

	private Timestamp createdAt;
	private Timestamp updatedAt;

	@Override
	public int hashCode() {
		return Objects.hash(createdAt, orderNumber, orderStatus, paymentMethodId, totalCost, updatedAt, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(createdAt, other.createdAt) && Objects.equals(orderNumber, other.orderNumber)
				&& orderStatus == other.orderStatus && paymentMethodId == other.paymentMethodId
				&& Float.floatToIntBits(totalCost) == Float.floatToIntBits(other.totalCost)
				&& Objects.equals(updatedAt, other.updatedAt) && userId == other.userId;
	}

	@Override
	public String toString() {
		return "order [userId=" + userId + ", totalCost=" + totalCost + ", orderNumber=" + orderNumber
				+ ", paymentMethodId=" + paymentMethodId + ", orderStatus=" + orderStatus + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}

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

}
