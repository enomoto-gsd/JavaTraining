package work6;

public class School3 {
	public static void main(String[] args) {
		Student2 s = new Student2("渋谷太郎",22);
		s.introduction();
		//アクセサメソッドを使って設定
		s.setName("変更太郎");
		s.setAge(23);
		s.introduction();

	}

}
