package work10;

import java.util.HashMap;

//���Ɠ��ۑ� HashMap�̎g�����B
public class Work3 {
	public static void main(String[] args) {
		//������̎��o���B
		HashMap<String,String> strMap = new HashMap<>();
		strMap.put("����","�W���W���̊�Ȗ`��");
		strMap.put("�Q�[��","OMORI");
		strMap.put("�y��", "Piano");
		
		System.out.println(strMap.get("����"));
		System.out.println(strMap.get("�Q�[��"));
		System.out.println(strMap.get("�y��"));
		
		//�����l�̎����B
		HashMap<String,Integer> intMap = new HashMap<>();
		intMap.put("1",4056);
		intMap.put("2",123);
		intMap.put("3",244);
		
		System.out.println(intMap.get("1"));
		System.out.println(intMap.get("2"));
		System.out.println(intMap.get("3"));
	}

}
