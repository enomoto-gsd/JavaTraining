package model;
import java.util.ArrayList;

public class UserManager {
	
	public ArrayList<User> getUser(String testId,String password) {
		int iPassword = Integer.parseInt(password);
		ArrayList<User>userList = new ArrayList<>();
		User user = new User(testId,iPassword);
		userList.add(user);
		return userList;
		}
	}

