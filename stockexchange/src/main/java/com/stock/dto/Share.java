package com.stock.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Share {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long unitPrice;
	private long noOfShares;
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
	public synchronized long getNoOfShares() {
		return noOfShares;
	}
	public synchronized void setNoOfShares(long noOfShares) {
		this.noOfShares = noOfShares;
	}
	
	
	
	
	
	

}
