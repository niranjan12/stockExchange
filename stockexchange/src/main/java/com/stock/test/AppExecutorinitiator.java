package com.stock.test;

import com.stock.config.StockConfig;
import com.stock.utils.AppExecutorThread;

public class AppExecutorinitiator {

	public static void main(String[] args) {
		StockConfig config = new StockConfig();
		System.out.println(config.init().isContinueThread());
		Thread thread = new Thread(new AppExecutorThread(config));
		thread.start();

	}

}
