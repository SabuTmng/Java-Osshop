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
public class Category {

	private int categoryId;
	private String categoryName;
	private int parentCategoryId;
	private int status;
	private Timestamp creationDate;
	private Timestamp lastUpdateDate;

	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @return the parentCategoryId
	 */
	public int getParentCategoryId() {
		return parentCategoryId;
	}

	/**
	 * @param parentCategoryId the parentCategoryId to set
	 */
	public void setParentCategoryId(int parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the creationDate
	 */
	public Timestamp getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @return the lastUpdateDate
	 */
	public Timestamp getLastUpdateDate() {
		return lastUpdateDate;
	}

	/**
	 * @param lastUpdateDate the lastUpdateDate to set
	 */
	public void setLastUpdateDate(Timestamp lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoryName, creationDate, lastUpdateDate, parentCategoryId, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return Objects.equals(categoryName, other.categoryName) && Objects.equals(creationDate, other.creationDate)
				&& Objects.equals(lastUpdateDate, other.lastUpdateDate) && parentCategoryId == other.parentCategoryId
				&& status == other.status;
	}

	@Override
	public String toString() {
		return "Category [categoryName=" + categoryName + ", parentCategoryId=" + parentCategoryId + ", status="
				+ status + ", creationDate=" + creationDate + ", lastUpdateDate=" + lastUpdateDate + "]";
	}

	/**
	 * @return the categoryId
	 */
	public int getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
