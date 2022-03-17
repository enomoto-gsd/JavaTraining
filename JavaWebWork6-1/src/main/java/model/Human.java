package model;

public class Human {
	private String name;	//氏名
	private int age;	//年齢
	

	//コンストラクタ
	public Human(String name,int age){
		this.name = name;
		this.age= age;
	}
	
	//以下、アクセサメソッド
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

	
	
}
