package com.kabank.mvc.factory;

public class SqlFactory {
	public static String create(int pos,String add,String sql) {
		StringBuffer buffer = new StringBuffer();
		buffer.insert(pos, add).append(sql);
		return buffer.toString();
	}

}
