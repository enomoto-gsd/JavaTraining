package work9;
//���Ɠ��ۑ�2�@ArrayIndexOutOfBoundsException�𔭐������Ă݂�B���̌�A��O�𔭐������Ȃ��悤�ɂ���B
public class Work2 {
	public static void main(String[] args) {
		try {
			int [] array = new int[3];
			array[0] = 10;
			array[1] = 12;
			array[2] = 30;
			System.out.println(array[0]);
			System.out.println(array[1]);
			System.out.println(array[2]);
			//�ȉ��A14�s�ڂ�ArrayIndexOutOfBoundsException����������B
			System.out.println(array[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�w�肵���z��O���w�肵�Ă��܂��B");
		}
		
	}

}
