package com.stock.dto;

public class Bank {
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
