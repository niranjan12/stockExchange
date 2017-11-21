package com.stock.serviceI;

import java.util.List;

import com.stock.dto.Company;
import com.stock.dto.Share;

public interface CompanyService {
	
	public void addCompany(Company company);
	
	public void updateCompany(Company c);
	
	public List<Company> getAllCompanies();
	
	public Company getCompanyById(int id);
	
	public List<Company> getTopGainers();
	
	public List<Company> getTopLoosers();
	
	public void publishShare(Share s);
	

}
