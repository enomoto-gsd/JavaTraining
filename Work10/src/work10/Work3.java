package work10;

import java.util.HashMap;

//öÆàÛè HashMapÌg¢ûB
public class Work3 {
	public static void main(String[] args) {
		//¶ñÌæèoµB
		HashMap<String,String> strMap = new HashMap<>();
		strMap.put("æ","WWÌï­È`¯");
		strMap.put("Q[","OMORI");
		strMap.put("yí", "Piano");
		
		System.out.println(strMap.get("æ"));
		System.out.println(strMap.get("Q["));
		System.out.println(strMap.get("yí"));
		
		//®lÌæèûB
		HashMap<String,Integer> intMap = new HashMap<>();
		intMap.put("1",4056);
		intMap.put("2",123);
		intMap.put("3",244);
		
		System.out.println(intMap.get("1"));
		System.out.println(intMap.get("2"));
		System.out.println(intMap.get("3"));
	}

}
