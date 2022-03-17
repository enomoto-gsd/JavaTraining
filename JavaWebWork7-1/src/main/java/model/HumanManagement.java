package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HumanManagement {
	Connection con =null;
	PreparedStatement ps= null;
	int count;
	ResultSet rs = null;
	
	public void insert(String name,String age) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url ="jdbc:mysql://localhost/user?characterEncoding=UTF-8&serverTimezone=JST";
			String user = "root";
			String password ="rootpass";
			con= DriverManager.getConnection(url,user,password);
			
			String sql = "INSERT INTO user_list(name,age) VALUE(?,?)";
			ps = con.prepareStatement(sql);
			
			ps.setString(1, name);
			int iAge = Integer.parseInt(age); 
			ps.setInt(2, iAge);
			
			count = ps.executeUpdate();
			System.out.println(count +"件処理しました。");
			close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	
	}
	
	public ArrayList<Human> select(){
		ArrayList<Human> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// ②データベースへの接続
			String url  = "jdbc:mysql://localhost/user?characterEncoding=UTF-8&serverTimezone=JST";
			String user = "root";
			String password = "rootpass";
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT * FROM user_list";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				Human human = new Human(name,age);
				list.add(human);
			}
				close();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
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
