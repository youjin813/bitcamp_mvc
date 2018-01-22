package com.kabank.mvc.enums;

public enum OracleEnum {
	ORACLE_DRIVER("oracle.jdbc.driver.OracleDriver"),
	ORACLE_CONNECTION_URL("jdbc:oracle:thin:@localhost:1521:xe"),
	ORACLE_USERNAME("bitcamp"),
	ORACLE_PASSWORD("bitcamp");

	public final String value;
	private OracleEnum(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
}
