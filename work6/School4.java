package work6;

//課題
public class School4 {
	public static void main(String[] args) {
		//インスタンス化
		Student3 s = new Student3("榎本一樹",26,0,1);
		//自己紹介
		s.introduction();
		s.ageCalculation();
		s.introduction();
		System.out.println("今は" + s.getAge() + "です。");


	}

}
