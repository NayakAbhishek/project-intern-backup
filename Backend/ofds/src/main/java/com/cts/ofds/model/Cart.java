package com.cts.ofds.model;

public class Cart {
	private int cartId;
	private String userId;
	private int dishId;
	private String dishName;
	private double price;
	private int quantity;
	
	public Cart() {}

	public Cart(String userId, int dishId, String dishName, double price, int quantity) {
		
		this.userId = userId;
		this.dishId = dishId;
		this.dishName = dishName;
		this.price = price;
		this.quantity = quantity;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", userId=" + userId + ", dishId=" + dishId + ", dishName=" + dishName
				+ ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
		
}
