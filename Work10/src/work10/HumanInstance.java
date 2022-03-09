package work10;
import java.util.ArrayList;

//10章まとめ課題の実行クラス。ArrayList
public class HumanInstance {
	public static void main(String[] args) {
		//人を格納するリストの作成。
		ArrayList<Human> humanList = new ArrayList<>();
		//3つインスタンスを作成し、マップに格納する。
		Human h1  = new Human("榎本",26);
		Human h2  = new Human("丈太郎",26);
		Human h3  = new Human("仗助",26);
		
		humanList.add(h1);
		humanList.add(h2);
		humanList.add(h3);
		
		for(int i=0; i<humanList.size(); i++) {
			humanList.get(i).introduce();
		}
		
		
		
		
	}

}
