package Work4;

public class Work4 {
	public static void main(String[] args) {
		int x = 5+8;
		if(x >=10) {
			System.out.println("10以上です");
		}

		int y = 100/25;
		if(y>=10) {
			System.out.println("10以上です。");
		}else if(y<10){
			System.out.println("10未満です");
		}

		int z = 100%25;
		if(z==0) {
			System.out.println("割り算のあまりは0です。");
		}else if(z!=0) {
			System.out.println(z);

		//別解
		/*else{
			 System.out.println("割り算のあまりは" + z +"です。")
			  */
		}
	}

}
