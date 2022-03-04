package Work7;

public class School2 {
	public static void main(String[] args) {
		Student s = new Student();
		s.setAddress("埼玉県行田市門井町");
		String address = s.getAddress();
		System.out.println("住所は" + address + "です。");

		//以下、課題のメソッドを呼び出す。
		s.setSkill("Java","silver");
		s.setStudentInfo("A101", 492);

		String [] array = s.Appeal("Java","middle","fine");
		System.out.println("僕の得意なものは" + array[0]);
		System.out.println("僕の経験値は" + array[1]);
		System.out.println("僕の体調は" + array[2]);

		String hp =s.getHp(100);
		System.out.println(hp);

		//Appealをオーバーロードしたメソッドの呼び出し。
		String [] array2 = s.Appeal("Java","middle","fine","A");
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}

		//staticメソッドの呼び出し
		String num = Student.Count(100);
		System.out.println(num);







	}

}
