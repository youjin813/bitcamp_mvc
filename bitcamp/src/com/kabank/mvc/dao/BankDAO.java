package com.kabank.mvc.dao;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;

public interface BankDAO {
	public ResultMap createAccount(Command cmd);
	
	public ResultMap selectBanKById(Command cmd);	
}
