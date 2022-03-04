package work6;

public class School2 {
	public static void main(String[] args) {
		Student s = new Student();
		//20歳と表示される。
		s.introduction();


		Student s2 = new Student();
		s2.ageCalculation();
		//22歳と表示される
		s2.introduction();

		Student s3 = new Student();
		s3.ageCalculation();
		s3.ageCalculation();
		s3.ageCalculation();
		//23歳と表示される
		s3.introduction();
	}

}
