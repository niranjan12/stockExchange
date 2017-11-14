package com.stock.utils;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class HibernateSessionUtils {
	public static Session getHibernateSession() {
		return new Configuration().configure().buildSessionFactory().openSession();
	}

}
