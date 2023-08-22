package com.osshop.model;

import java.util.Objects;

class Billing {

	private int userId;
	private double amount;
	private java.util.Date paymentDate;
	private int orderId;

	public int getPaymentMethodId() {
		return paymentMethodId;
	}

	public void setPaymentMethodId(int paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}

	private int paymentMethodId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int user_id) {
		this.userId = user_id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public java.util.Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(java.util.Date payment_date) {
		this.paymentDate = payment_date;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int order_id) {
		this.orderId = order_id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, orderId, paymentDate, paymentMethodId, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Billing other = (Billing) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount) && orderId == other.orderId
				&& Objects.equals(paymentDate, other.paymentDate) && paymentMethodId == other.paymentMethodId
				&& userId == other.userId;
	}

	@Override
	public String toString() {
		return "Billing [userId=" + userId + ", amount=" + amount + ", paymentDate=" + paymentDate + ", orderId="
				+ orderId + ", paymentMethodId=" + paymentMethodId + "]";
	}

}