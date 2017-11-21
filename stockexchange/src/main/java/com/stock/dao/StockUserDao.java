package com.stock.dao;

import org.hibernate.Session;

import com.stock.dto.StockUsers;
import com.stock.utils.HibernateSessionUtils;

public class StockUserDao {
	private Session session;
	
	public StockUsers getStockUser(int id){
		session = HibernateSessionUtils.getHibernateSession();
		StockUsers stockUser = null;
		stockUser = (StockUsers)session.get(StockUsers.class, id);
		session.close();
		return stockUser;
		
	}
	
	public  void updateStockuser(StockUsers user){
		
		
		
	} 
	public static void main(String[] args) {
		StockUserDao dao = new StockUserDao();
		System.out.println(dao.getStockUser(50).getName());
		
	}
	

}
