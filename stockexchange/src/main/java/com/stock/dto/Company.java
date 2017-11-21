package com.stock.dto;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Company {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	private String name;
	@OneToOne
	private Share shares;
	@ManyToMany
	private Set<StockUsers> customers;
	@OneToMany
	@JoinColumn(name="cbank_id")
	private List<Bank> bank;
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
	public Share getShares() {
		return shares;
	}
	/**
	 * @param shares the shares to set
	 */
	public void setShares(Share shares) {
		this.shares = shares;
	}
	/**
	 * @return the customers
	 */
	public Set<StockUsers> getCustomers() {
		return customers;
	}
	/**
	 * @param customers the customers to set
	 */
	public void setCustomers(Set<StockUsers> customers) {
		this.customers = customers;
	}
	public List<Bank> getBank() {
		return bank;
	}
	public void setBank(List<Bank> bank) {
		this.bank = bank;
	}
	
	
	

}
