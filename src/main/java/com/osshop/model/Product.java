package com.osshop.model;

import java.util.Objects;

public class Product {

	private int ProductId;
	private String ProductName;
	private int ProductPrice;
	private int ProductStatus;
	private int DiscountCouponId;
	private String Description;
	private String ProductImagePath;
	private int Qty;

	private int CategoryId;

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	/**
	 * @return the categoryId
	 */
	public int getCategoryId() {
		return CategoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return ProductName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		ProductName = productName;
	}

	/**
	 * @return the productPrice
	 */
	public int getProductPrice() {
		return ProductPrice;
	}

	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(int productPrice) {
		ProductPrice = productPrice;
	}

	/**
	 * @return the productStatus
	 */
	public int getProductStatus() {
		return ProductStatus;
	}

	/**
	 * @param productStatus the productStatus to set
	 */
	public void setProductStatus(int productStatus) {
		ProductStatus = productStatus;
	}

	/**
	 * @return the discountCouponId
	 */
	public int getDiscountCouponId() {
		return DiscountCouponId;
	}

	/**
	 * @param discountCouponId the discountCouponId to set
	 */
	public void setDiscountCouponId(int discountCouponId) {
		DiscountCouponId = discountCouponId;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return Description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		Description = description;
	}

	/**
	 * @return the productImagePath
	 */
	public String getProductImagePath() {
		return ProductImagePath;
	}

	/**
	 * @param productImagePath the productImagePath to set
	 */
	public void setProductImagePath(String productImagePath) {
		ProductImagePath = productImagePath;
	}

	/**
	 * @return the qty
	 */
	public int getQty() {
		return Qty;
	}

	/**
	 * @param qty the qty to set
	 */
	public void setQty(int qty) {
		Qty = qty;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CategoryId, Description, DiscountCouponId, ProductImagePath, ProductName, ProductPrice,
				ProductStatus, Qty);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return CategoryId == other.CategoryId && Objects.equals(Description, other.Description)
				&& DiscountCouponId == other.DiscountCouponId
				&& Objects.equals(ProductImagePath, other.ProductImagePath)
				&& Objects.equals(ProductName, other.ProductName) && ProductPrice == other.ProductPrice
				&& ProductStatus == other.ProductStatus && Qty == other.Qty;
	}

	@Override
	public String toString() {
		return "Product [ProductName=" + ProductName + ", ProductPrice=" + ProductPrice + ", ProductStatus="
				+ ProductStatus + ", DiscountCouponId=" + DiscountCouponId + ", Description=" + Description
				+ ", ProductImagePath=" + ProductImagePath + ", Qty=" + Qty + ", CategoryId=" + CategoryId + "]";
	}

}
