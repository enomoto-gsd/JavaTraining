package model1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
public class HumanManager {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		public void close()throws SQLException{
			if(con!=null) {
				con.close();
			}else if(ps!=null) {
				ps.close();
			}else if(rs!=null) {
				rs.close();
			}
		}
		
		public ArrayList<Human> getHumanList(){
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
	}


