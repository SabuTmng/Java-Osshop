/**
 * 
 */
package com.osshop.model;

import java.sql.*;
import java.util.Objects;

/**
 * @author apple
 *
 */
public class DiscountCoupon {

	private String DiscountCode;
	private int DiscountPercentage;
	private Date DiscountStartDate;
	private Date DiscountEndDate;
	private String DiscountDescription;
	private Timestamp CreatedDate;
	private Timestamp UpdatedDate;

	/**
	 * @return the discountCode
	 */
	public String getDiscountCode() {
		return DiscountCode;
	}

	/**
	 * @param discountCode the discountCode to set
	 */
	public void setDiscountCode(String discountCode) {
		DiscountCode = discountCode;
	}

	/**
	 * @return the discountPercentage
	 */
	public int getDiscountPercentage() {
		return DiscountPercentage;
	}

	/**
	 * @param discountPercentage the discountPercentage to set
	 */
	public void setDiscountPercentage(int discountPercentage) {
		DiscountPercentage = discountPercentage;
	}

	/**
	 * @return the discountStartDate
	 */
	public Date getDiscountStartDate() {
		return DiscountStartDate;
	}

	/**
	 * @param discountStartDate the discountStartDate to set
	 */
	public void setDiscountStartDate(Date discountStartDate) {
		DiscountStartDate = discountStartDate;
	}

	/**
	 * @return the discountEndDate
	 */
	public Date getDiscountEndDate() {
		return DiscountEndDate;
	}

	/**
	 * @param discountEndDate the discountEndDate to set
	 */
	public void setDiscountEndDate(Date discountEndDate) {
		DiscountEndDate = discountEndDate;
	}

	/**
	 * @return the discountDescription
	 */
	public String getDiscountDescription() {
		return DiscountDescription;
	}

	/**
	 * @param discountDescription the discountDescription to set
	 */
	public void setDiscountDescription(String discountDescription) {
		DiscountDescription = discountDescription;
	}

	/**
	 * @return the createdDate
	 */
	public Timestamp getCreatedDate() {
		return CreatedDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Timestamp createdDate) {
		CreatedDate = createdDate;
	}

	/**
	 * @return the updatedDate
	 */
	public Timestamp getUpdatedDate() {
		return UpdatedDate;
	}

	/**
	 * @param updatedDate the updatedDate to set
	 */
	public void setUpdatedDate(Timestamp updatedDate) {
		UpdatedDate = updatedDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CreatedDate, DiscountCode, DiscountDescription, DiscountEndDate, DiscountPercentage,
				DiscountStartDate, UpdatedDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiscountCoupon other = (DiscountCoupon) obj;
		return Objects.equals(CreatedDate, other.CreatedDate) && Objects.equals(DiscountCode, other.DiscountCode)
				&& Objects.equals(DiscountDescription, other.DiscountDescription)
				&& Objects.equals(DiscountEndDate, other.DiscountEndDate)
				&& DiscountPercentage == other.DiscountPercentage
				&& Objects.equals(DiscountStartDate, other.DiscountStartDate)
				&& Objects.equals(UpdatedDate, other.UpdatedDate);
	}

	@Override
	public String toString() {
		return "DiscountCoupon [DiscountCode=" + DiscountCode + ", DiscountPercentage=" + DiscountPercentage
				+ ", DiscountStartDate=" + DiscountStartDate + ", DiscountEndDate=" + DiscountEndDate
				+ ", DiscountDescription=" + DiscountDescription + ", CreatedDate=" + CreatedDate + ", UpdatedDate="
				+ UpdatedDate + "]";
	}

}
