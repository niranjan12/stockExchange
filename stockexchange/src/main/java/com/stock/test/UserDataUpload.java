package com.stock.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.stock.dto.Bank;
import com.stock.dto.Company;
import com.stock.dto.Share;
import com.stock.dto.StockUsers;
import com.stock.utils.HibernateSessionUtils;

public class UserDataUpload {

	public static void main(String[] args) {
		Session session = HibernateSessionUtils.getHibernateSession();
		String name = "user";
		int count = 100;
		Transaction txn = session.beginTransaction();
		for(int i=51;i<=count;i++){
			Bank bank = (Bank) session.get(Bank.class, 3);
			StockUsers user = new StockUsers();
			user.setName("user_"+i);
			user.setAddress("Hyderabad");
			user.setBank(bank);
			session.save(user);
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@"+i);
			
		}
		txn.commit();
		

	}

}
