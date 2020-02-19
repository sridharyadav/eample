package com.capgemini.dd.ui;



import java.util.*;


import com.capgemini.dd.dto.UpdateStock;
import com.capgemini.dd.exception.IndexOutOfRange;
import com.capgemini.dd.exception.NotNumeric;
import com.capgemini.dd.service.UpdateProcessDateService;
import com.capgemini.dd.service.UpdateStockService;
import com.capgemini.dd.util.StockRepository;

public class UpdateStockMain extends Exception {
	public static void main(String[] args) {
		UpdateStockService obj=new UpdateStockService();
		UpdateProcessDateService obj1= new UpdateProcessDateService();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter 1 for delivery && manufacture Date && expiry date \n enter 2 for process date\n enter 3 to break");
			
			int n=sc.nextInt();
			
			switch(n) {
			case 1:
				System.out.println("Enter a String as A1, A2,A3");  
				String s=sc.next();
				System.out.println(obj.service(s));
				
				continue;
				
			case 2:
				System.out.println("Enter a String as A1, A2,A3");
				String d=sc.next();
				System.out.println(obj1.service(d));
				
				continue;
			
			case 3:
				break;
				
			}
			break;
			
		
		
			
		}
	
	sc.close();
		
	}

	public static UpdateStock setDates(UpdateStock up) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter process Date");
		String s=sc.next();
		System.out.println("in main before");
		up.setProcessDate(s);
		return up;
		
	}
	

	


}
