package work10;
import java.util.ArrayList;

//���Ɠ��ۑ�@ArrayList�̎g�����B
public class Work2 {
	public static void main(String[]args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("ABC");
		list.add("DEF");
		list.add("GHI");
		for(String str :list) {
			System.out.println(str);
		}
		
		/*�ʉ�
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		*/
		
		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		
		for(int num :numList){
			System.out.println(num);
		}
	}
	
}
