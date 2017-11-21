package com.stock.test;

import java.util.ArrayList;

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
		int count = 100;
		Transaction txn = session.beginTransaction();
		for(int i=0;i<=count;i++){
			String usr = "user_"+i;
			Bank bank = new Bank();
			bank.setBalance(0);
			bank.setDeposit(0);
			bank.setAccountNumber(i);
			bank.setName(usr);
			ArrayList<Bank> banks = new ArrayList<Bank>();
			banks.add(bank);
			StockUsers user = new StockUsers();
			user.setName(usr);
			user.setBank(banks);
			user.setAddress("Hyderabad");
			session.save(bank);
			session.save(user);
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@"+i);
			
		}
		txn.commit();
		

	}

}
