package br.com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection(){
			 try {
				return DriverManager.getConnection("jdbc:mysql://localhost/fj21","root","");
			} catch (SQLException erro) {
				// TODO Auto-generated catch block
				throw new RuntimeException(erro);
			}
			}
			
			
	
	}
	

