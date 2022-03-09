package work9;
//授業内課題1 意図的にNullPointExcptionを発生させてみる。その後、その例外処理を行う。
public class Work1 {
	public static void main(String[]args) {
	String employeeName = "一樹";
	String name = null;
	try {
		//意図的に例外を発生させてみます。
		if(name.equals(employeeName)) {
			System.out.println("同一名です。");
		}else {
			System.out.println("違います");
		}
    }catch(NullPointerException e) {
		System.out.println("nullにアクセスしています。");
	}
   }
}
