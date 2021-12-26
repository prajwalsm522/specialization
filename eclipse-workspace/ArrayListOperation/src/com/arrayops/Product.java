package com.arrayops;

public class Product {
	private int pId;
	private String pName;
	private int pQty;
	private int pPrice;
	
	public Product(int pId, String pName, int pQty, int pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pQty = pQty;
		this.pPrice = pPrice;
	}
	
	public Product() {
		super();
	}

	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpQty() {
		return pQty;
	}
	public void setpQty(int pQty) {
		this.pQty = pQty;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pQty=" + pQty + ", pPrice=" + pPrice + "]";
	}
	
}
