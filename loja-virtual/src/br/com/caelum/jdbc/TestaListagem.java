package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
//import java.sql.*;
	
	
public class TestaListagem {

	
	public static void main(String[] args) throws SQLException {
	
		Connection Conexao = Database.getConnetion();
	
		Statement statement = Conexao.createStatement();
		boolean resultado = statement.execute("select * from DEPT");
		ResultSet resultSet = statement.getResultSet();
		while(resultSet.next()) {
		    String depto = resultSet.getString("DEPTNO");
		    String nome = resultSet.getString("DNAME");
		    String localizacao = resultSet.getString("LOC");
		    System.out.println(depto +" | " + nome +" | "+ localizacao);
		    
		}
		resultSet.close();
		statement.close();
		Conexao.close();
		System.out.println("Conexão encerrada!!");
		
	}


}



