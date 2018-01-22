package com.kabank.mvc.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.kabank.mvc.iterator.ParamsIterator;

public class ChangeCommand implements IOrder{
	Map<?, ?> map;
	public ChangeCommand(HttpServletRequest request) {
		map = ParamsIterator.execute(request);
	}
	@Override
	public void execute() {
		String change = String.valueOf(map.get("newPass"));
		InitCommand.cmd.setData(change);
	}

}
