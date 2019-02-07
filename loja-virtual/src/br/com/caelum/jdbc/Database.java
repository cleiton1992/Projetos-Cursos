package br.com.caelum.jdbc;

//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleConnectionPoolDataSource;


public class Database {
	private OracleConnectionPoolDataSource oracleDataSource;

    public Database() throws SQLException {
    	oracleDataSource = new OracleConnectionPoolDataSource();
        oracleDataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
        oracleDataSource.setUser("cleiton");
        oracleDataSource.setPassword("123456");

    }

   static Connection getConnection() throws SQLException, ClassNotFoundException {
        return Database.getConnection(oracleDataSource);

    }

}