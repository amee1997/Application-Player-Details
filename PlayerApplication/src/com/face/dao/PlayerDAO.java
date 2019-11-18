package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import PlayerPackage.Player;
import com.face.util.ConnectionManager;

public class PlayerDAO {
 
	ConnectionManager cm = new ConnectionManager();
	
	 public void showSkill(String skill) throws ClassNotFoundException, SQLException {
		  Connection conn = cm.getConnection();
		  Statement st = conn.createStatement();
		  ResultSet rs = st.executeQuery(" select * from players where skill='"+skill+"'");
		  if(rs.next()) {
			  System.out.println("Player Name"+"    "+"Country"+"       "+"Skills"+"     "+"Team Name");
			  System.out.println("--------------------------------------------------------------------");
			  do {
		      System.out.println(rs.getString(1)+"   "+rs.getString(2)+"    "+rs.getString(3)+"      "+rs.getString(4));
			  }while(rs.next());
		  }
	  }
	  
	
	  public  void getPlayerDetails() throws ClassNotFoundException, SQLException {
		  Connection conn = cm.getConnection();
		  Statement st = conn.createStatement();
		  ResultSet rs = st.executeQuery(" select * from players");
		  if(rs.next()) {
			  System.out.println("Player Name"+"    "+"Country"+"       "+"Skills"+"     "+"Team Name");
			  System.out.println("--------------------------------------------------------------------");
			  do {
		      System.out.println(rs.getString(1)+"   "+rs.getString(2)+"    "+rs.getString(3)+"      "+rs.getString(4));
			  }while(rs.next());
		  }
	  }
	 

}
