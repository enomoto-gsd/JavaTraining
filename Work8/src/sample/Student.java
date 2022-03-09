package sample;

public class Student extends Human{
	String studentId; //学籍番号
	
	void speak() {
		System.out.println("僕は学生です");
	}
	void study(){
		System.out.println("学生なので、勉強をします。");
	}
}
