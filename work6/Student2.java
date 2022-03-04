package work6;

public class Student2 {
	private String name;
	private int age;
	//コンストラクタ
	Student2(String name, int age){
		this.name = name;
		this.age = age;
	}

	//アクセスメソッド
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
		System.out.println("私の名前は" + name +"です");
		System.out.println("私の年齢は" + age + "です");
	}
	//年齢計算メソッド
	void ageCalculation() {
		age = age +1;
		System.out.println("私は" + age + "歳になりました。");
	}

}
