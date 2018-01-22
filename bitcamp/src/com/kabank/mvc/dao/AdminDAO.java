package com.kabank.mvc.dao;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;

public interface AdminDAO {

	public ResultMap createTable(Command cmd);


}
