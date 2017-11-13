package com.stock.dto;

import java.util.List;

public class Company {
	int id;
	private String name;
	private List<Share> shares;
	private List<StockUsers> customers;
	private Bank bank;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the shares
	 */
	public List<Share> getShares() {
		return shares;
	}
	/**
	 * @param shares the shares to set
	 */
	public void setShares(List<Share> shares) {
		this.shares = shares;
	}
	/**
	 * @return the customers
	 */
	public List<StockUsers> getCustomers() {
		return customers;
	}
	/**
	 * @param customers the customers to set
	 */
	public void setCustomers(List<StockUsers> customers) {
		this.customers = customers;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	
	

}
