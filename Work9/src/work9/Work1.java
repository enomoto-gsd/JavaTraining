package work9;
//���Ɠ��ۑ�1 �Ӑ}�I��NullPointExcption�𔭐������Ă݂�B���̌�A���̗�O�������s���B
public class Work1 {
	public static void main(String[]args) {
	String employeeName = "���";
	String name = null;
	try {
		//�Ӑ}�I�ɗ�O�𔭐������Ă݂܂��B
		if(name.equals(employeeName)) {
			System.out.println("���ꖼ�ł��B");
		}else {
			System.out.println("�Ⴂ�܂�");
		}
    }catch(NullPointerException e) {
		System.out.println("null�ɃA�N�Z�X���Ă��܂��B");
	}
   }
}
