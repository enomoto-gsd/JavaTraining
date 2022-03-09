package javaIntermediateWork1;

public class Robot {
	String name; //ロボットの名前
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void introduction() {
		System.out.println("私の名前は" + name + "です。");
	}
}
