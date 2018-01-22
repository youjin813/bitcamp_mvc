package com.kabank.mvc.daoImpl;

import com.kabank.mvc.dao.AttendDAO;
import com.kabank.mvc.enums.OracleEnum;

public class AttendDAOImpl implements AttendDAO{
	public static AttendDAO getInstance() {
		return new AttendDAOImpl();
	}
	private  AttendDAOImpl() {
		try {
			Class.forName(OracleEnum.ORACLE_DRIVER.getValue());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
