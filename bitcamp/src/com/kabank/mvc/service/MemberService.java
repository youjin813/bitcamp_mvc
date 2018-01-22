package com.kabank.mvc.service;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;

public interface MemberService {
	public ResultMap findMemberById(Command cmd);
	public ResultMap login(Command cmd);
	public ResultMap changePass(Command cmd);
	public ResultMap delete(Command cmd);
	public ResultMap join(Command cmd);
}
