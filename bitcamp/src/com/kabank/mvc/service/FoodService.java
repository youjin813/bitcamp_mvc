package com.kabank.mvc.service;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.domain.FoodBean;

public interface FoodService {

	public ResultMap findFoodById(Command cmd);

}
