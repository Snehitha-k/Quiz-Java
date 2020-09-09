package Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class Connectdb {
	
	static Connection con=null;
	static String name="";
	static String url="jdbc:mysql://localhost:3306/"+name;
	static String username="xxxxxxxxx";
	static String pswd="xxxxxxxxxx";
	
	public static void getdata() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			con=DriverManager.getConnection(url, username, pswd);
		} catch (SQLException e) {
			// TODO Auto-generate catch block
			e.printStackTrace();
		}
	
	}
}
