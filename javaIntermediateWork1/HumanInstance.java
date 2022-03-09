package javaIntermediateWork1;

public class HumanInstance {
	public static void main(String[] args) {
		Human h1 = new Human();
		h1.setAge(26);
		h1.setName("榎本一樹");
		h1.speak();
		
		
		Student s = new Student();
		s.setAge(26);
		s.setName("榎本一樹");
		s.speak();
		
		//親クラスのデータがたの変数に親クラスのオブジェクトを代入
		Human h2 = h1;
		Human h3 = s;
		
		System.out.println("親クラスのメソッドを実行");
		h1.speak();
		System.out.println("子クラスのメソッドを実行");
		s.speak();

	}

}
