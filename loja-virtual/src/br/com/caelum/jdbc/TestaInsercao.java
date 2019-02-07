package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
	
	
public class TestaInsercao {
	public static void main(String[] args) throws SQLException {
	try( Connection Conexao = Database.getConnetion(); ){
		
		Conexao.setAutoCommit(false);
	
			String deptno ="65"; 			//	numero
			String dname = "tests'1"; 		// 	departamento nome	
			String loc = "abc paulista"; 	// 	localização
			String sql = "insert into DEPT (deptno, dname, loc) values (?, ?, ?)";
			
		try( PreparedStatement statement = Conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);){
				
				statement.setString(1, deptno);
				statement.setString(2, dname);
				statement.setString(3, loc);
				statement.execute();
				
				Conexao.commit();
					System.out.println("Inclusao realizada com sucesso!");
				
				statement.close();
		
			}catch (Exception e) {
				e.printStackTrace();
				Conexao.rollback();
				
				System.out.println("Rollback Efetuado por segurança. ");
			}
			finally {
				Conexao.close();
				System.out.println("Conexao fechada com sucesso!");
			}	
		}
	}	
}



//package br.com.caelum.jdbc;
//
////import java.sql.Connection;
////import java.sql.DriverManager;
////import java.sql.SQLException;
//import java.sql.*;
//
//public class Database {
//	 static Connection getConnetion() throws SQLException {
//		Connection Conexao = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "cleiton", "123456");
//		
//
//		return Conexao ;
//
//	 }
//}
//

