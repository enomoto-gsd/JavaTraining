package sample;

public class Animal {
	String animalKinds; //動物の名前
	int energy;		   //体力
	
	void run() {
		System.out.println("走ります");
	}
	
	void sleep () {
		System.out.println("眠ります");
		energy += 100;
	}
	
	void eat() {
		System.out.println("食事をします");
		energy +=50;
	}
}
