package com.stock.test;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class HibernectContest {
	public static  void main(String...a) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		System.out.println(session);


	}
	
}
