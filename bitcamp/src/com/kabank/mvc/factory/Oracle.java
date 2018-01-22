package com.kabank.mvc.factory;

import java.sql.Connection;
import java.sql.DriverManager;

import com.kabank.mvc.enums.OracleEnum;

public class Oracle implements IDatabase{
	private Connection conn;
	private String driver,url,username,password;
	
	public Oracle() {
		this.driver = OracleEnum.ORACLE_DRIVER.getValue();
		this.url = OracleEnum.ORACLE_CONNECTION_URL.getValue();
		this.username = OracleEnum.ORACLE_USERNAME.getValue(); 
		this.password = OracleEnum.ORACLE_PASSWORD.getValue();
	}

	@Override
	public Connection getConnection() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
