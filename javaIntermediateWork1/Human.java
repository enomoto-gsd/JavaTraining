package javaIntermediateWork1;

public class Human {
	private String name; //����
	private int age;	//�N��
	
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
		System.out.println("���O��" + name + "�ł��B" + "�N���" + age+ "�ł�");
		
	}
	
	
}
