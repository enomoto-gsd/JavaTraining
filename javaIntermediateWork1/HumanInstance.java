package javaIntermediateWork1;

public class HumanInstance {
	public static void main(String[] args) {
		Human h1 = new Human();
		h1.setAge(26);
		h1.setName("�|�{���");
		h1.speak();
		
		
		Student s = new Student();
		s.setAge(26);
		s.setName("�|�{���");
		s.speak();
		
		//�e�N���X�̃f�[�^�����̕ϐ��ɐe�N���X�̃I�u�W�F�N�g����
		Human h2 = h1;
		Human h3 = s;
		
		System.out.println("�e�N���X�̃��\�b�h�����s");
		h1.speak();
		System.out.println("�q�N���X�̃��\�b�h�����s");
		s.speak();

	}

}
