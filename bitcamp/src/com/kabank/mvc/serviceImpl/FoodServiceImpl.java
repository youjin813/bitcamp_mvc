package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.domain.FoodBean;
import com.kabank.mvc.service.FoodService;

public class FoodServiceImpl implements FoodService{
	public static FoodService getInstance() {
		return new FoodServiceImpl();
		}
	private FoodServiceImpl() {
	}
	
	@Override
	public ResultMap findFoodById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

}
