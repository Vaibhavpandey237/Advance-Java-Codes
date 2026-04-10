// how to connect database in java
package database_Connect;

import java.sql.*;

public class Main1 {
	public static void main(String[] args) {


			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url = "jdbc:oracle:thin:@localhost:1521:XE";
				String username = "system";
				String password = "Vkp@8052";
				
				Connection conn = DriverManager.getConnection(url,username,password);
				System.out.println("Connected to Oracle 10g successfully!");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("Select * from Employee1");		
				while(rs.next()) {
					System.out.println(rs.getInt(1) + "-" + rs.getString(2));
					
				}
				rs.close();
				stmt.close();
				conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
		}

	}

