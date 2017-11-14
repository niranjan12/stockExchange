package com.stock.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long deposit;
	private long withDraw;
	private long balance;
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
	public synchronized long getDeposit() {
		return deposit;
	}
	public synchronized void setDeposit(long deposit) {
		this.deposit = deposit;
	}
	public synchronized long getWithDraw() {
		return withDraw;
	}
	public synchronized void setWithDraw(long withDraw) {
		this.withDraw = withDraw;
	}
	public synchronized long getBalance() {
		return balance;
	}
	public synchronized void setBalance(long balance) {
		this.balance = balance;
	}
	
	

}
