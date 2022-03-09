package work10;

/*10章　まとめ課題
 * 人の役割を持つクラスを作成してください。
 * 人は氏名と年齢（どちらもカプセル化）を持ち、自己紹介できる機能を持ちます。
 * 人を格納するリストを作成してください
 * 上記で作成した人くらすから3つ以上、インスタンスを作成し、リストに格納してください。
 * リストの中身を順番に取得し、自己紹介してももらいましょう。
 */
public class Human {
	private String name; //氏名
	private int age; //年齢
	
	//名前と年齢を受け取るコンストラクタ
	Human(String name, int age){
		this.name = name;
		this.age =age;
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

	void introduce() {
		System.out.println("私の名前は" + name + "です。"+"年齢は"+ age + "です。");
		
	}
	
}
