package work6;

//課題
public class Student3 {
	//メンバ変数
	private String name; //氏名
	private int age; 	//年齢
	private int glade;	//成績
	private int runk;	//順位


	Student3(String name,int age,int glade, int runk){
		this.name=name;
		this.age = age;
		this.glade = glade;
		this.runk = runk;
	}

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

	public int getGlade() {
		return glade;
	}

	public void setGlade(int glade) {
		this.glade = glade;
	}

	public int getRunk() {
		return runk;
	}

	public void setRunk(int runk) {
		this.runk = runk;
	}

	//自己紹介メソッド
	void introduction() {
		System.out.println("私の名前は" + name +"です");
		System.out.println("私の年齢は" + age + "です");
		System.out.println("私の成績は" + glade +"です");
		System.out.println("私の成績は" + runk +"です");
	}
	//年齢計算メソッド
	void ageCalculation() {
		age = age +1;
		System.out.println("私は" + age + "歳になりました。");
	}



}
