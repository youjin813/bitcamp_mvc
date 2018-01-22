package com.kabank.mvc.dao;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;

public interface CommonDAO {
	public ResultMap selectTableCount(Command cmd);

}
