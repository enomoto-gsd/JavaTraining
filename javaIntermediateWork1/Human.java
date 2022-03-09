package javaIntermediateWork1;

public class Human {
	private String name; //氏名
	private int age;	//年齢
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void speak() {
		System.out.println("名前は" + name + "です。" + "年齢は" + age+ "です");
		
	}
	
	
}
