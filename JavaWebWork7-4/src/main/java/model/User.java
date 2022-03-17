package model;

public class User {
	private String testId;
	private int password;
	
	User(String testId,int password){
		this.testId =testId;
		this.password=password;
	}
	public String getTestId() {
		return testId;
	}
	public void setTestId(String testId) {
		this.testId = testId;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
}
