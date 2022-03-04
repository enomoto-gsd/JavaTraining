package work3;

public class Work6 {
	public static void main(String[] args) {
		int [] x = {10,100,150};
		String[] s = {"ABC","あいう"};

		System.out.println("x[0]の値は" +x[0]);
		System.out.println("ｘ[１]の値は" +x[1]);
		System.out.println("x[2]の値は" +x[2]);
		System.out.println("y[0]の値は" +s[0]);
		System.out.println("y[0]の値は" +s[1]);
		//応用
		int [] x2 = x;
		x2[0] = 50000;
		System.out.println("変更後の値は"+ x2[0]);

		//ArrayIndexOutOfBoundsExceptionが発生する。
		System.out.println(s[3]);

	}

}
