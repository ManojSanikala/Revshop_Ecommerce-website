package com.entity;

public class Wishlist {

	private int cid;
	private int pid;
	private int userId;
	private String productname;
	private Double price;
	private Double totalPrice;
	private String photoName; // Add this field

    // Getters and Setters
    public String getPhotoName() {
        return photoName;
    }

    public void setImageUrl(String photoName) {
        this.photoName = photoName;
    }

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

}