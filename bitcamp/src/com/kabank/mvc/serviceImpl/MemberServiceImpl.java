package com.kabank.mvc.serviceImpl;


import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.daoImpl.MemberDAOImpl;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.service.MemberService;

public class MemberServiceImpl implements MemberService{
	public static MemberService getInstance() {
		return new MemberServiceImpl();
	}

	@Override
	public ResultMap findMemberById(Command cmd) {
		return MemberDAOImpl.getInstance().selectMemberById(cmd);
	}

	@Override
	public ResultMap join(Command cmd) {
		return MemberDAOImpl.getInstance().joinMember(cmd);
	}

	@Override
	public ResultMap login(Command cmd) {
		return MemberDAOImpl.getInstance().login(cmd);
	}

	@Override
	public ResultMap changePass(Command cmd) {
		return MemberDAOImpl.getInstance().updatePass(cmd);
	}

	@Override
	public ResultMap delete(Command cmd) {
		return MemberDAOImpl.getInstance().deleteMember(cmd);
	}
}
