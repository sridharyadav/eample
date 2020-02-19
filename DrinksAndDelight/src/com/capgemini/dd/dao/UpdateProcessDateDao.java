package com.capgemini.dd.dao;


import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.dd.dto.UpdateStock;
import com.capgemini.dd.exception.InvalidStringException;
import com.capgemini.dd.ui.UpdateStockMain;
import com.capgemini.dd.util.StockRepository;

public class UpdateProcessDateDao extends Exception {
	
	static Map<String ,UpdateStock> obj1=StockRepository.getStockRepository();
	
	Scanner sc= new Scanner(System.in);
	static List<UpdateStock> list=new ArrayList<UpdateStock>();
	
	
	public static List<UpdateStock> date(String a) throws InvalidStringException{
		int count=0;
		for(Map.Entry<String,UpdateStock> map:obj1.entrySet()) 
		{
			String s= map.getKey();
			
			UpdateStock obj3=map.getValue();
			
			if(s.contentEquals(a)) 
			{
	
				UpdateStockMain.setDates(obj3);
				
				System.out.println(obj3.getProcessDate());
				count++;
			}
			
			list.add(obj3);   
		
		}
		if(count==0) {
			throw new InvalidStringException("invalid String");
		}
		return list;
		
		
	}
	

}

