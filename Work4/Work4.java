package Work4;

public class Work4 {
	public static void main(String[] args) {
		int x = 5+8;
		if(x >=10) {
			System.out.println("10�ȏ�ł�");
		}

		int y = 100/25;
		if(y>=10) {
			System.out.println("10�ȏ�ł��B");
		}else if(y<10){
			System.out.println("10�����ł�");
		}

		int z = 100%25;
		if(z==0) {
			System.out.println("����Z�̂��܂��0�ł��B");
		}else if(z!=0) {
			System.out.println(z);

		//�ʉ�
		/*else{
			 System.out.println("����Z�̂��܂��" + z +"�ł��B")
			  */
		}
	}

}
