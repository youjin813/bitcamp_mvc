package com.kabank.mvc.dao;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;

public interface MobileDAO {

	public ResultMap openNumber(Command cmd);

	public ResultMap SelectMobileById(Command cmd);

}
