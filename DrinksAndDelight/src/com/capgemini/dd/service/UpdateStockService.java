package com.capgemini.dd.service;

import java.util.*;

import com.capgemini.dd.dao.UpdateStockDao;
import com.capgemini.dd.dto.UpdateStock;
import com.capgemini.dd.exception.InvalidStringException;;

public class UpdateStockService {
	UpdateStockDao s=new UpdateStockDao();
	public List<UpdateStock> service(String a){
		List<UpdateStock> result=null;
		try {
			 result=s.date(a);
		}
		catch(InvalidStringException e) {
			e.printStackTrace();
		}
		return result;
	}

}
