package work3;

public class Work6 {
	public static void main(String[] args) {
		int [] x = {10,100,150};
		String[] s = {"ABC","������"};

		System.out.println("x[0]�̒l��" +x[0]);
		System.out.println("��[�P]�̒l��" +x[1]);
		System.out.println("x[2]�̒l��" +x[2]);
		System.out.println("y[0]�̒l��" +s[0]);
		System.out.println("y[0]�̒l��" +s[1]);
		//���p
		int [] x2 = x;
		x2[0] = 50000;
		System.out.println("�ύX��̒l��"+ x2[0]);

		//ArrayIndexOutOfBoundsException����������B
		System.out.println(s[3]);

	}

}
