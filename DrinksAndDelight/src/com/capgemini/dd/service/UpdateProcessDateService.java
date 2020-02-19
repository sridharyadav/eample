package com.capgemini.dd.service;

import java.util.*;

import com.capgemini.dd.dao.UpdateProcessDateDao;
import com.capgemini.dd.dao.UpdateStockDao;
import com.capgemini.dd.dto.UpdateStock;
import com.capgemini.dd.exception.InvalidStringException;;

public class UpdateProcessDateService {
	
	public List<UpdateStock> service(String a){
		List<UpdateStock> result=null;
		try {
			 result=UpdateProcessDateDao.date(a);
		}
		catch(InvalidStringException e) {
			e.printStackTrace();
		}
		return result;
	}
	

}
