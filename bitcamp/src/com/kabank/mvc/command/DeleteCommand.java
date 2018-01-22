package com.kabank.mvc.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.iterator.ParamsIterator;

public class DeleteCommand implements IOrder{
	Map<?, ?> map;
	HttpSession session;
	public DeleteCommand(HttpServletRequest request) {
		map = ParamsIterator.execute(request);
		session = request.getSession();
	}
	@Override
	public void execute() {
		InitCommand.cmd.setData(((MemberBean)session.getAttribute("user")).getId());
		System.out.println(InitCommand.cmd.getData()+"==============");
	}

}
