package ASimulatorSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
		Connection c;
		Statement s;
		
		public Conn()
		{
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // register jdbc driver in our program
				String url = "jdbc:sqlserver://DESKTOP-R93LQUO\\SQLEXPRESS;databaseName=ASimulationSystem;integratedSecurity=true";
				c = DriverManager.getConnection(url); // connection setup with microsoft sql
				s = c.createStatement(); // used to access to our database
				System.out.println("connected!");
			} 
			catch (Exception e) {
				System.out.println(e);
			}
		}
}
