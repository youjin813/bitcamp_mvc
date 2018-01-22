package com.kabank.mvc.daoImpl;


import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.dao.MobileDAO;
import com.kabank.mvc.enums.DMLEnum;
import com.kabank.mvc.enums.OracleEnum;
import com.kabank.mvc.enums.Vendor;
import com.kabank.mvc.factory.DatabaseFactory;

public class MobileDAOImpl implements MobileDAO{

	public static MobileDAO getInstance() {
		return new MobileDAOImpl();
	}
	private MobileDAOImpl() {
		try {
			Class.forName(OracleEnum.ORACLE_DRIVER.getValue());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ResultMap openNumber(Command cmd) {
		System.out.println("-----MobileDAOIMPL OPENNUMBER IN------");
		String sql = DMLEnum.OPENNUMBER.toString();
		System.out.println("---PHONE D SQ문 확인-------"+sql);
		//System.out.println("------핸드폰 번호 확인------"+number);
		try {
			DatabaseFactory.create(Vendor.ORACLE)
			.getConnection()
			.createStatement()
			.executeUpdate(String.format(sql, 010 ,"kt",InitCommand.cmd.getData()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("-----MobileDAOIMPL OPENNUMBER OUT------");
		return null;
	}
	@Override
	public ResultMap SelectMobileById(Command cmd) {

		return null;
	} 
}
