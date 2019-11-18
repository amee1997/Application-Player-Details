package com.face.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {

	public  Connection getConnection() throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/player","root","");  
		
		if (con != null)
		{
			System.out.println("Connected");
		}
		else
		{
			System.out.println("not Connected");
		}
		Statement st = con.createStatement();
		return con;
		}

}
