package com.stock.utils;

import com.stock.config.StockConfig;

public class AppExecutorThread implements Runnable{
	StockConfig config;
	AppExecutorThread(){}
	
	public AppExecutorThread(StockConfig config){
		this.config = config;
	}

	public void run() {
		System.out.println("Innside run...");
		while(config.init().isContinueThread()){
			
			System.out.println("service is up..now..");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Got a request for shut down of the service...!!!");
		
	}

}
