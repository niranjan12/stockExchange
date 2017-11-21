package com.stock.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.stock.dto.Company;
import com.stock.utils.HibernateSessionUtils;

public class CompanyDao {
	
	private Session session;
	
	@SuppressWarnings("unchecked")
	public List<Company> getAllCompanies(){
		List<Company> companies = null;
		session = HibernateSessionUtils.getHibernateSession();
		Query query = session.createQuery("from Company c");
		companies = query.list();
		return companies;
		
	}
	
	public Company getCompanyById(int id){
		Company company =  null;
		session = HibernateSessionUtils.getHibernateSession();
		company = (Company) session.get(Company.class, id);
		return company;
		
	}
	
	public static void main(String[] args) {
		CompanyDao dao = new CompanyDao();
		Company c = dao.getCompanyById(3);
		System.out.println(c.getBank());
		
	}

}
