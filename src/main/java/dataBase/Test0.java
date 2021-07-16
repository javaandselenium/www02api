package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.mysql.cj.jdbc.Driver;

public class Test0 {
	@Test
	public void readData() throws SQLException {
		//Step:1 Register the database
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		//Step:2 Connect to Database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wwwo2","root","root");
		
		//Step:3 Create SQL query statement
		Statement statement = con.createStatement();
		String query = "select * from wwwo2table";
		
		//Step:4 execute query
		ResultSet result = statement.executeQuery(query);
		while(result.next()) {
			System.out.println(result.getString(1));
			System.out.println(result.getString(2));
		}
		
		//Step:5 close the connection
		con.close();
	}

}
