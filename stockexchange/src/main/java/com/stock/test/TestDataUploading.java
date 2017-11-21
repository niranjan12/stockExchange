package com.stock.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.stock.dto.Bank;
import com.stock.dto.Company;
import com.stock.dto.Share;
import com.stock.utils.HibernateSessionUtils;

public class TestDataUploading {

	public static void main(String[] args) {
		Company company1 = new Company();
		company1.setName("Mahindra");
		Bank bank1 = new Bank();
		bank1.setName("Mahindra");
		bank1.setDeposit(0);
		bank1.setWithDraw(0);
		bank1.setAccountNumber(56789);
		bank1.setBalance(5000000);
		ArrayList<Bank> b = new ArrayList<Bank>();
		b.add(bank1);
		company1.setBank(b);
		Share share = new Share();
		share.setName("Mahindra");
		share.setUnitPrice(60);
		List<Share> shares = new ArrayList<Share>();
		shares.add(share);
		company1.setShares(share);
		Session session = HibernateSessionUtils.getHibernateSession();
		Transaction txn = session.beginTransaction();
		session.save(bank1);
		session.save(share);
		session.save(company1);
		txn.commit();
		
		
		

	}

}
