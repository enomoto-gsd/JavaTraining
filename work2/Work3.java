package work2;
import java.time.LocalDate;

public class Work3 {
	public static void main(String[]args) {
		//���݂̓��t��LocalDate�^�N���Xlocaldate�ϐ��ɑ��
		LocalDate localdate = LocalDate.now();
		int current_year = localdate.getYear();
		System.out.println("�����I�����s�b�N��"+ current_year +"�N�ɊJ�Âł�");

		/*����
		 * System.out.println("�����I�����s�b�N��2022�N�ɊJ�Âł�");
		 */

	}
}
