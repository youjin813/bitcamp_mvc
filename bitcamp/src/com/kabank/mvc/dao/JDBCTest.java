package com.kabank.mvc.dao;

import java.sql.*;

public class JDBCTest {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bitcamp","bitcamp");
			Statement stmt = conn.createStatement();
			String sql = "SELECT COUNT(*) AS count FROM tab";
			ResultSet rs = stmt.executeQuery(sql);
			String count = "";
			while(rs.next()) {
				count = rs.getString("count");  //11번째줄에 있는 count
			}
			System.out.println("테이블 수:" +count);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
