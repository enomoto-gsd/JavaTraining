package javaIntermediateWork1;

public class Student extends Human {
	@Override
	public void speak() {
		//親クラスのgetNameメソッドを使用。
		System.out.println("名前は" + super.getName() + "です");
	}
}
