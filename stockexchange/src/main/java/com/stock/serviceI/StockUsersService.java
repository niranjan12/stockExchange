package com.stock.serviceI;

import com.stock.dto.StockUsers;

public interface StockUsersService {
	public void adddUser(StockUsers user);
	public void updateUser(StockUsers user);
	
	public void removeUser(StockUsers user);

}
