package work10;

/*10�́@�܂Ƃ߉ۑ�
 * �l�̖��������N���X���쐬���Ă��������B
 * �l�͎����ƔN��i�ǂ�����J�v�Z�����j�������A���ȏЉ�ł���@�\�������܂��B
 * �l���i�[���郊�X�g���쐬���Ă�������
 * ��L�ō쐬�����l���炷����3�ȏ�A�C���X�^���X���쐬���A���X�g�Ɋi�[���Ă��������B
 * ���X�g�̒��g�����ԂɎ擾���A���ȏЉ�Ă����炢�܂��傤�B
 */
public class Human {
	private String name; //����
	private int age; //�N��
	
	//���O�ƔN����󂯎��R���X�g���N�^
	Human(String name, int age){
		this.name = name;
		this.age =age;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	void introduce() {
		System.out.println("���̖��O��" + name + "�ł��B"+"�N���"+ age + "�ł��B");
		
	}
	
}
