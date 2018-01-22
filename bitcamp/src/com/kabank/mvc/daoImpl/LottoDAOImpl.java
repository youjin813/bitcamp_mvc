package com.kabank.mvc.daoImpl;

import com.kabank.mvc.dao.LottoDAO;
import com.kabank.mvc.enums.OracleEnum;

public class LottoDAOImpl implements LottoDAO{
	public static LottoDAO getInstance() {
		return new LottoDAOImpl();
	}
	private  LottoDAOImpl() {
		try {
			Class.forName(OracleEnum.ORACLE_DRIVER.getValue());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
