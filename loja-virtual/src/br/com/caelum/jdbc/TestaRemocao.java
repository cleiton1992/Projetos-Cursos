package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
//import java.sql.*;
	
	
public class TestaRemocao {
	public static void main(String[] args) throws SQLException {
		try( Connection Conexao = Database.getConnetion(); ){
				Conexao.setAutoCommit(false);

				String valor = "50" ; //variavel temporaria
				String sql = "delete from dept where deptno >(?)";

				
			
			try( PreparedStatement statement = Conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);){
			
				statement.setString(1, valor);
			
				int count = statement.getUpdateCount();
				System.out.println(count + " Linhas Removidas");
				
				
				Conexao.commit();
				System.out.println("Limpeza concluida!!");
			
				statement.close();
			}catch (Exception e) {
				e.printStackTrace();
				Conexao.rollback();
				
				System.out.println("Rollback Efetuado por segurança. ");
			}
			finally {
				Conexao.commit();Conexao.close();
				System.out.println("Conexao fechada com sucesso!");
			}	
		}
	}	
}





