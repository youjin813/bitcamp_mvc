package com.kabank.mvc.service;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;

public interface MobileService {

	public ResultMap open(Command cmd);

	public ResultMap findMobileById(Command cmd);
}
