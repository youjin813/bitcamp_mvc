package com.kabank.mvc.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.dao.CommonDAO;
import com.kabank.mvc.enums.DMLEnum;
import com.kabank.mvc.enums.OracleEnum;
import com.kabank.mvc.enums.TnameEnum;
public class CommonDAOImpl implements CommonDAO{

	@Override
	public ResultMap selectTableCount(Command cmd) {
		String count = "";
		try {
			Class.forName(OracleEnum.ORACLE_DRIVER.getValue());
			Connection conn=DriverManager.getConnection(OracleEnum.ORACLE_CONNECTION_URL.getValue(),
					OracleEnum.ORACLE_USERNAME.getValue(),OracleEnum.ORACLE_PASSWORD.getValue());
			Statement stmt = conn.createStatement();
			//System.out.println(D);
			ResultSet rs = stmt.executeQuery(DMLEnum.COUNT.toString()+TnameEnum.MEMBER.toString());
			while(rs.next()) {
				count = rs.getString("count");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
