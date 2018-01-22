package com.kabank.mvc.command;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

import com.kabank.mvc.iterator.ParamsIterator;

public class LoginCommand implements IOrder{
	Map<?, ?> map;
	public LoginCommand(HttpServletRequest request) {
		map = ParamsIterator.execute(request);
	}

	@Override
	public void execute() {
		String id = String.valueOf(map.get("id"));
		String pass = String.valueOf(map.get("pass"));
		InitCommand.cmd.setColumn("id/pass");
		InitCommand.cmd.setData(id+"/"+pass);

	}
	

}
