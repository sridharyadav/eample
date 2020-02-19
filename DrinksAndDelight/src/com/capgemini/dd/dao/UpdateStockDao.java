package com.capgemini.dd.dao;

import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.dd.dto.UpdateStock;
import com.capgemini.dd.exception.InvalidStringException;
import com.capgemini.dd.util.StockRepository;

public class UpdateStockDao extends Exception {
	StockRepository obj=new StockRepository();
	Map<String ,UpdateStock> obj1=obj.getStockRepository();
	
	Scanner sc= new Scanner(System.in);
	List<UpdateStock> list=new ArrayList<UpdateStock>();
	
	
	public List<UpdateStock> date(String a) throws InvalidStringException{
		int count=0;
		for(Map.Entry<String,UpdateStock> map:obj1.entrySet()) 
		{
			String s= map.getKey();
			UpdateStock obj=map.getValue();
			if(s.contentEquals(a)) 
			{
				System.out.println("enter delivery Date");
				String d= sc.next();
				System.out.println("enter manufacture Date");
				String b= sc.next();
			
				System.out.println("enter Expire Date");
				String e= sc.next();
			
					obj.setManufactureDate(b);
					obj.setExpireDate(e);
					obj.setDeliveryDate(d);
		
				count++;
			}
			
		    list.add(obj);
		   
		
		}
		if(count==0) {
			throw new InvalidStringException("invalid String");
		}
		return list;
		
		
	}
	

}
