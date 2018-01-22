package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.dao.AdminDAO;
import com.kabank.mvc.daoImpl.AdminDAOImpl;
import com.kabank.mvc.enums.DDLEnum;
import com.kabank.mvc.enums.MemberEnum;
import com.kabank.mvc.service.AdminService;

public class AdminServiceImpl implements AdminService{

	@Override
	public void admin(String admin) {
		System.out.println("ddddddddd"+admin);
		AdminDAO dao = new AdminDAOImpl();
		String sql = "";
		switch (admin) {
		case "member":
			sql = MemberEnum.PROFILE.toString();
			break;
		case "attend":
			sql = MemberEnum.PROPERTIES.toString();
			break;
		case "bank":
			sql= DDLEnum.CREATE_TABLE_BANK.toString();
			break;	
		case "mobile":
			sql= DDLEnum.CREATE_TABLE_MOBILE.toString();
			break;
		}
		//dao.createTable(sql);
		
	}

}
