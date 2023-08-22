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
public class PaymentMethod {

	private String paymentMethodName;
	private String paymentMethodLogo;
	private int paymentMethodStatus;
	private Timestamp createdAt;
	private Timestamp updatedAt;

	/**
	 * @return the paymentMethodName
	 */
	public String getPaymentMethodName() {
		return paymentMethodName;
	}

	/**
	 * @param paymentMethodName the paymentMethodName to set
	 */
	public void setPaymentMethodName(String paymentMethodName) {
		this.paymentMethodName = paymentMethodName;
	}

	/**
	 * @return the paymentMethodLogo
	 */
	public String getPaymentMethodLogo() {
		return paymentMethodLogo;
	}

	/**
	 * @param paymentMethodLogo the paymentMethodLogo to set
	 */
	public void setPaymentMethodLogo(String paymentMethodLogo) {
		this.paymentMethodLogo = paymentMethodLogo;
	}

	/**
	 * @return the paymentMethodStatus
	 */
	public int getPaymentMethodStatus() {
		return paymentMethodStatus;
	}

	/**
	 * @param paymentMethodStatus the paymentMethodStatus to set
	 */
	public void setPaymentMethodStatus(int paymentMethodStatus) {
		this.paymentMethodStatus = paymentMethodStatus;
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
		return Objects.hash(createdAt, paymentMethodLogo, paymentMethodName, paymentMethodStatus, updatedAt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaymentMethod other = (PaymentMethod) obj;
		return Objects.equals(createdAt, other.createdAt) && Objects.equals(paymentMethodLogo, other.paymentMethodLogo)
				&& Objects.equals(paymentMethodName, other.paymentMethodName)
				&& paymentMethodStatus == other.paymentMethodStatus && Objects.equals(updatedAt, other.updatedAt);
	}

	@Override
	public String toString() {
		return "PaymentMethod [paymentMethodName=" + paymentMethodName + ", paymentMethodLogo=" + paymentMethodLogo
				+ ", paymentMethodStatus=" + paymentMethodStatus + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + "]";
	}

}
