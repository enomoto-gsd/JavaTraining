package work2;
import java.time.LocalDate;

public class Work3 {
	public static void main(String[]args) {
		//現在の日付をLocalDate型クラスlocaldate変数に代入
		LocalDate localdate = LocalDate.now();
		int current_year = localdate.getYear();
		System.out.println("東京オリンピックは"+ current_year +"年に開催です");

		/*正解
		 * System.out.println("東京オリンピックは2022年に開催です");
		 */

	}
}
