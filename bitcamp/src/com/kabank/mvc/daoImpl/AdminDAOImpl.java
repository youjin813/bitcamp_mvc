package com.kabank.mvc.daoImpl;


import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.dao.AdminDAO;
import com.kabank.mvc.enums.Vendor;
import com.kabank.mvc.factory.DatabaseFactory;

public class AdminDAOImpl implements AdminDAO{

	@Override
	public ResultMap createTable(Command cmd) {
			System.out.println("===MEMBER-D: delete IN=========");
			System.out.println(cmd);
			return null;
			
		}
	}
/*	StringBuffer buff = new StringBuffer(DMLEnum.SELECT.toString());
	buff.insert(11, " "+TnameEnum.tab.toString());
	buff.insert(6, " "+MemberEnum.PROPERTIES.toString());
	Class.forName(OracleEnum.ORACLE_DRIVER.getValue());
	Connection conn = DriverManager.getConnection(OracleEnum.ORACLE_CONNECTION_URL.getValue(),
			OracleEnum.ORACLE_USERNAME.getValue(),OracleEnum.ORACLE_PASSWORD.getValue());
	Statement stat = conn.createStatement();
	stat.executeUpdate(sql);
	sql = "buff";
	ResultSet rs = stat.executeQuery(sql);   
	List<String>list = new ArrayList<>();
	while(rs.next()) {
		String temp = rs.getString("TNAME");
		list.add(temp);
	}
	boolean exist = false;
	for(String s :list) {
		if(s.equalsIgnoreCase("member")) {
			exist = true;
			break;
		}
	}
	if(!exist) {
		sql=MemberEnum.PROPERTIES.toString();
		stat.executeQuery(sql);
	}
	}catch (Exception e) {
	e.printStackTrace();*/
