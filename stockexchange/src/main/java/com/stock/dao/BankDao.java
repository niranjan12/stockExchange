package com.stock.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.stock.dto.Bank;
import com.stock.utils.HibernateSessionUtils;

public class BankDao {
	private Session session;
	
	public List<Bank> getAllBanks(){
		session = HibernateSessionUtils.getHibernateSession();
		List<Bank> banks = null;
		Query query = session.createQuery("from Bank b");
		banks = query.list();
		session.close();
		return banks;
		
	}
	
	public Bank getBankById(int id){
		session = HibernateSessionUtils.getHibernateSession();
		Bank bank = null;
	    bank = (Bank) session.get(Bank.class, id);
		return bank;
	}
	
	public static void main(String[] args) {
		BankDao dao= new BankDao();
		System.out.println(dao.getBankById(2));
		
	}

}
