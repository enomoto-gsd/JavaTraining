package work6;

public class Student2 {
	private String name;
	private int age;
	//�R���X�g���N�^
	Student2(String name, int age){
		this.name = name;
		this.age = age;
	}

	//�A�N�Z�X���\�b�h
	public String getNeme() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	void introduction() {
		System.out.println("���̖��O��" + name +"�ł�");
		System.out.println("���̔N���" + age + "�ł�");
	}
	//�N��v�Z���\�b�h
	void ageCalculation() {
		age = age +1;
		System.out.println("����" + age + "�΂ɂȂ�܂����B");
	}

}
