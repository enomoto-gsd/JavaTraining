package work10;
import java.util.HashMap;

//10�͂܂Ƃ߉ۑ�̎��s�N���X�@HashMap
public class HumanInstance2 {
	public static void main(String[] args) {
		Human h1 = new Human("�|�{",26);
		Human h2 = new Human("�g�ǋg�e",34);
		Human h3 = new Human("�f�B�A�{��",28);
		
		HashMap<String,Human> humanMap = new HashMap<>();
		humanMap.put("1",h1);
		humanMap.put("2",h2);
		humanMap.put("3",h3);
		
		humanMap.get("1").introduce();
		humanMap.get("2").introduce();
		humanMap.get("3").introduce();

	}
}