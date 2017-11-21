package com.stock.dto;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class StockUsers {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	@ManyToMany(mappedBy = "customers", fetch = FetchType.LAZY)
	private List<Company> companies;
	@OneToMany
	@JoinColumn(name = "ubank_id")
	private List<Bank> bank;
	@OneToMany
	@JoinColumn(name = "share_id")
	private Set<Share> shares;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the companies
	 */
	public List<Company> getCompanies() {
		return companies;
	}
	/**
	 * @param companies the companies to set
	 */
	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}
	/**
	 * @return the bank
	 */
	public List<Bank> getBank() {
		return bank;
	}
	/**
	 * @param bank the bank to set
	 */
	public void setBank(List<Bank> bank) {
		this.bank = bank;
	}
	public synchronized Set<Share> getShares() {
		return shares;
	}
	public synchronized void setShares(Set<Share> shares) {
		this.shares = shares;
	}
	
	
	

}
