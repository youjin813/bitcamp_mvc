package com.kabank.mvc.daoImpl;

import com.kabank.mvc.dao.FoodDAO;
import com.kabank.mvc.enums.OracleEnum;

public class FoodDAOImpl implements FoodDAO{
	
	public static FoodDAO getInstance() {
		return new FoodDAOImpl();
	}
	private  FoodDAOImpl() {
		try {
			Class.forName(OracleEnum.ORACLE_DRIVER.getValue());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
	