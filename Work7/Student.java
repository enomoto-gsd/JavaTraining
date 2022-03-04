package Work7;

public class Student {
	private String name;
	private int age;
	private String address; //住所を追加
	private String skill;
	private String lv;
	private String id;
	private int password;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress(){
		return address;
	}

	void setAddress(String address){
	    this.address = address;
	}
	//以下、課題。いろいろなメソッドを増やしてみる。

	//技術とレベルをセットするメソッド。
	void setSkill(String skill,String lv) {
		this.skill=skill;
		this.lv =lv;
	}

	//IDとパスワードをセットするメソッド。
	public void setStudentInfo(String id,int password) {
		this.id = id;
		this.password=password;
	}

	 //
	 public String [] Appeal(String skill, String exp ,String status) {
		  String [] appealArr = new String[3];
		  appealArr[0] = skill;
		  appealArr[1] = exp;
		  appealArr[2] = status;
		  return appealArr;
	}

	 //hpを返すメソッド
	 public String getHp(int hp) {
		 String telparse = String.valueOf(hp);
		 return telparse;
	 }

	 public static String Count(int num) {
		 String num2 = String.valueOf(num);
		 return num2;
	 }

	 //課題：オーバーロード
	 public String [] Appeal(String skill, String exp ,String status,String grade) {
		  String [] appealArr = new String[3];
		  appealArr[0] = skill;
		  appealArr[1] = exp;
		  appealArr[2] = status;
		  appealArr[3] = grade;
		  return appealArr;
	}


	void introduction() {
		System.out.println("私の名前は" + name +"です");
		System.out.println("私の年齢は" + age + "です");
	}

	void ageCalculation() {
		age = age +1;
		System.out.println("私は" + age + "歳になりました。");
	}
}
