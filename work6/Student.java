package work6;

public class Student {
	String name = "�X�N�[���Y";	//����
	int age = 20;               //�N��
	int grade = 2;        		//�w�N
	int rank = 1;         		//����

	//���ȏЉ�\�b�h
	void introduction() {
		System.out.println("���̖��O��" + name +"�ł�");
		System.out.println("���̔N���" + age + "�ł�");
	}
	//�N��v�Z���\�b�h
	void ageCalculation() {
		age = age +1;
		System.out.println("����" + age + "�΂ɂȂ�܂����B");
	}
}
