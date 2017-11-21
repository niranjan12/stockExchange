package com.stock.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class StockConfig {
	private boolean continueThread;

	public StockConfig init(){
		StockConfig config = new StockConfig();
		Properties prop = new Properties();
		try {
			FileInputStream input = new  FileInputStream("./src/main/resources/configuration.properties");
			try {
				prop.load(input);
				String temp = prop.getProperty("continueThread");
				continueThread = Boolean.valueOf(temp);
				config.setContinueThread(continueThread);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return config;
		
	}
	
	
	public synchronized boolean isContinueThread() {
		
		return continueThread;
	}

	public synchronized void setContinueThread(boolean continueThread) {
		this.continueThread = continueThread;
	}
	
	

}
