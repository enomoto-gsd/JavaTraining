package Work7;

public class School2 {
	public static void main(String[] args) {
		Student s = new Student();
		s.setAddress("��ʌ��s�c�s��䒬");
		String address = s.getAddress();
		System.out.println("�Z����" + address + "�ł��B");

		//�ȉ��A�ۑ�̃��\�b�h���Ăяo���B
		s.setSkill("Java","silver");
		s.setStudentInfo("A101", 492);

		String [] array = s.Appeal("Java","middle","fine");
		System.out.println("�l�̓��ӂȂ��̂�" + array[0]);
		System.out.println("�l�̌o���l��" + array[1]);
		System.out.println("�l�̑̒���" + array[2]);

		String hp =s.getHp(100);
		System.out.println(hp);

		//Appeal���I�[�o�[���[�h�������\�b�h�̌Ăяo���B
		String [] array2 = s.Appeal("Java","middle","fine","A");
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}

		//static���\�b�h�̌Ăяo��
		String num = Student.Count(100);
		System.out.println(num);







	}

}
