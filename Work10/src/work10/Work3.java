package work10;

import java.util.HashMap;

//授業内課題 HashMapの使い方。
public class Work3 {
	public static void main(String[] args) {
		//文字列の取り出し。
		HashMap<String,String> strMap = new HashMap<>();
		strMap.put("漫画","ジョジョの奇妙な冒険");
		strMap.put("ゲーム","OMORI");
		strMap.put("楽器", "Piano");
		
		System.out.println(strMap.get("漫画"));
		System.out.println(strMap.get("ゲーム"));
		System.out.println(strMap.get("楽器"));
		
		//整数値の取り方。
		HashMap<String,Integer> intMap = new HashMap<>();
		intMap.put("1",4056);
		intMap.put("2",123);
		intMap.put("3",244);
		
		System.out.println(intMap.get("1"));
		System.out.println(intMap.get("2"));
		System.out.println(intMap.get("3"));
	}

}
