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
		company1.setName("MAHENDRA");
		Bank bank1 = new Bank();
		bank1.setName("ICICI Bank");
		bank1.setDeposit(0);
		bank1.setWithDraw(0);
		bank1.setBalance(6000000);
		company1.setBank(bank1);
		Share share = new Share();
		share.setName("MAHENDRA");
		share.setUnitPrice(60);
		List<Share> shares = new ArrayList<Share>();
		shares.add(share);
		company1.setShares(shares);
		Session session = HibernateSessionUtils.getHibernateSession();
		Transaction txn = session.beginTransaction();
		session.save(bank1);
		session.save(share);
		session.save(company1);
		txn.commit();
		
		
		

	}

}
