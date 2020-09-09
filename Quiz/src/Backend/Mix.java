package Backend;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Mix extends Connectdb {
	
	public  static String qs,o1,o2,o3,c;
	public static void getdata() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			con=DriverManager.getConnection(url, username, pswd);
		} catch (SQLException e) {
			// TODO Auto-generate catch block
			e.printStackTrace();
		}
		String query=("SELECT * FROM questionbank.mixedbag order by rand() limit 1 ");
		
		PreparedStatement s= con.prepareStatement(query);
		ResultSet rs=s.executeQuery();
		 if (rs.next()) {
			 qs=rs.getString("question");
			 o1=rs.getString("option1");
			 o2=rs.getString("option2");
			 o3=rs.getString("option3");
			 c=rs.getString("crctans");
			 
			 
		 }
		 
		 
	}
	
	public String getqs() {
		return qs;
	}
	public String geto1() {
		return o1;
	}
	public String geto2() {
		return o2;
	}
	public String geto3() {
		return o3;
	}
	public String getc() {
		return c;
	}
	

}

