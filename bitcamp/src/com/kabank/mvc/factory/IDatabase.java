package com.kabank.mvc.factory;

import java.sql.Connection;

public interface IDatabase {
	public Connection getConnection(); 
}
