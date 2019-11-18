package MainPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.dao.PlayerDAO;
import com.face.util.ConnectionManager;


import PlayerPackage.Player;
public class Main {
	 static PlayerDAO pdo = new PlayerDAO();
	  static Player pl = new Player();
	  static ConnectionManager cm = new ConnectionManager();
	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
	
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 	     do {
            System.out.println("Menu");
 	        System.out.println("1.List all players \n2.Add new player \n3.Search player");
 	        int n;
 	        n=Integer.parseInt(br.readLine());
 	   switch(n) {
	   case 1:
		  
			 System.out.println("Player details");
			 pdo.getPlayerDetails(); //method used for calling player details
			 break;
	   case 2:
		     System.out.println("Enter the Player Name");
		     String pname = br.readLine();
		     System.out.println("Enter the Country");
		     String coun = br.readLine();
		     System.out.println("Enter the skill");
		     String skills = br.readLine();
		     System.out.println("Enter the Team Name");
		     String tname = br.readLine();
		     Connection conn = cm.getConnection();
			 Statement st = conn.createStatement();
		     st.executeUpdate("insert into players (playername,country,skill,teamname) values ('"+pname+"','"+coun+"','"+skills+"','"+tname+"')");
		     System.out.println("Data Inserted successfully");
		     break;

	   case 3: 
		     System.out.println("Enter the skill name");
		     String skill = br.readLine();
	         pdo.showSkill(skill);
	         break;
		}
 	   }while(true);
	}

}
