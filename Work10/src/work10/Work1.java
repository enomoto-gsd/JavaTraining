package work10;
import java.util.Random;
import java.util.ArrayList;

//�ۑ�
public class Work1 {
	public static void main(String[] args) {
		//�����̕\��
		Random rand = new Random();
		System.out.println(rand.nextInt());
		
		//�������i�[����B
		ArrayList<Integer> list = new ArrayList<>();
		list.add(rand.nextInt());
		for(int num : list) {
			System.out.println(num);
		}
		
		/*�ʉ�
			for(int i=0; i<10; i++){
				list.add(random.nextInt());
			}
		*/
	}

}
