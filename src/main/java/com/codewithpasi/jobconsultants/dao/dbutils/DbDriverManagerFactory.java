package com.codewithpasi.jobconsultants.dao.dbutils;

public class DbDriverManagerFactory {

	public DbDriverManager getDbdriver(String databaseType) {

		if (databaseType.equals("MySql")) {
			return new DbDriverManagerMySqlImpl();
		}
		else {
			return null;
		}
	}


}
