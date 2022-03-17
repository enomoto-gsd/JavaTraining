package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class LoginManager {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public LoginUser Login(String id,String password) {
		String dtid = null;
		String dtpass = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url ="jdbc:mysql://localhost/user?characterEncoding=UTF-8&serverTimezone=JST";
			String user = "root";
			String pass ="rootpass";
			con = DriverManager.getConnection(url, user, pass);
			String sql = "SELECT * FROM login_user";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				 dtid = rs.getString("id");
				 dtpass = rs.getString("password");
			}
				close();			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		LoginUser loginuser = new LoginUser(dtid,dtpass);
		if(id.equals(loginuser.getId()) && password.equals(dtpass)) {
			return loginuser;
		}else{
			return null;
		}
		
	}
	
	
	public void close() throws SQLException {
		if(con!=null) {
			con.close();
		}else if(ps!=null) {
			ps.close();
		}else if(rs!=null) {
			rs.close();
		}
	}
}
