package com.mock;

// Create a class Stock to represent the Stock
public class Stock {
	private String stockId; 
	private String name; 
	private int quantity; 
	
	// Constructor for the class
	public Stock(String stockId, String name, int quantity) {
		this.stockId = stockId; 
		this.name = name; 
		this.quantity = quantity; 
	}
	
	// A few Getters and Setters

	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getTicker() {
		return name; 
	}
}
