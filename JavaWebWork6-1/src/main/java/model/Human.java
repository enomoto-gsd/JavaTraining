package model;

public class Human {
	private String name;	//����
	private int age;	//�N��
	

	//�R���X�g���N�^
	public Human(String name,int age){
		this.name = name;
		this.age= age;
	}
	
	//�ȉ��A�A�N�Z�T���\�b�h
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
