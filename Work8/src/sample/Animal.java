package sample;

public class Animal {
	String animalKinds; //�����̖��O
	int energy;		   //�̗�
	
	void run() {
		System.out.println("����܂�");
	}
	
	void sleep () {
		System.out.println("����܂�");
		energy += 100;
	}
	
	void eat() {
		System.out.println("�H�������܂�");
		energy +=50;
	}
}
