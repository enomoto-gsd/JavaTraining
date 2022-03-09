package work9;
//授業内課題2　ArrayIndexOutOfBoundsExceptionを発生させてみる。その後、例外を発生させないようにする。
public class Work2 {
	public static void main(String[] args) {
		try {
			int [] array = new int[3];
			array[0] = 10;
			array[1] = 12;
			array[2] = 30;
			System.out.println(array[0]);
			System.out.println(array[1]);
			System.out.println(array[2]);
			//以下、14行目でArrayIndexOutOfBoundsExceptionが発生する。
			System.out.println(array[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("指定した配列外を指定しています。");
		}
		
	}

}
