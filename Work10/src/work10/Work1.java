package work10;
import java.util.Random;
import java.util.ArrayList;

//‰Û‘è
public class Work1 {
	public static void main(String[] args) {
		//—”‚Ì•\¦
		Random rand = new Random();
		System.out.println(rand.nextInt());
		
		//—”‚ğŠi”[‚·‚éB
		ArrayList<Integer> list = new ArrayList<>();
		list.add(rand.nextInt());
		for(int num : list) {
			System.out.println(num);
		}
		
		/*•Ê‰ğ
			for(int i=0; i<10; i++){
				list.add(random.nextInt());
			}
		*/
	}

}
