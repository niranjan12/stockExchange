package com.stock.dto;

public class Share {
	private int id;
	private String name;
	private long unitPrice;
	public synchronized int getId() {
		return id;
	}
	public synchronized void setId(int id) {
		this.id = id;
	}
	public synchronized String getName() {
		return name;
	}
	public synchronized void setName(String name) {
		this.name = name;
	}
	public synchronized long getUnitPrice() {
		return unitPrice;
	}
	public synchronized void setUnitPrice(long unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	

}
