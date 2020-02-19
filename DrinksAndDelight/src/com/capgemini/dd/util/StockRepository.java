package com.capgemini.dd.util;

import java.util.*;

import com.capgemini.dd.dto.UpdateStock;


public  class StockRepository {
	
	public static HashMap<String,UpdateStock> obj1=new HashMap<String, UpdateStock>();
	
	Scanner sc=new Scanner(System.in);
		public StockRepository() {
		
			
			obj1.put("A1",new UpdateStock("A1","Cock",20.0,"40",800.0,"jalandhar01","good"));
			obj1.put("A2",new UpdateStock("A2","Maza",20.0,"40",800.0,"jalandhar01","good"));
			obj1.put("A3",new UpdateStock("A3","Cock",90.0,"50",4500.0,"jalandhar01","good"));
			
		}
	public static Map<String ,UpdateStock> getStockRepository() {
		return obj1; 
	}
	


		
}
