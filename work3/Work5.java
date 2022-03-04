package work3;


public class Work5 {
	public static void main(String[] args) {
			String str  = "Hello";
			System.out.println("Hello");
			System.out.println(str.length());
			System.out.println(str.toUpperCase());
			//応用問題
			System.out.println(str.toLowerCase());
			System.out.println(str.contains("e"));
			/*上記は不正解。下記が正解
			System.out.println(str.indexOf("e"));
			*/
			System.out.println(str.substring(1, 4));


	}

}
