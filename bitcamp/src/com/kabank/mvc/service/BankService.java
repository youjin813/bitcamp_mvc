package com.kabank.mvc.service;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;

public interface BankService {

	public ResultMap create(Command cmd);

	public ResultMap findAccountById(Command cmd);

}
