package com.stock.serviceI;

import java.util.List;

import com.stock.dto.Share;

public interface StockService {
	public List<Share> getAllShareDetails();
	
	public void updateShare(Share c);
	
	public Share getShareDetailsByID(int id);
	
	public void addShareToCompany(int compayId);
	

}
