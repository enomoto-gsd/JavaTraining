package work6;

//�ۑ�
public class Student3 {
	//�����o�ϐ�
	private String name; //����
	private int age; 	//�N��
	private int glade;	//����
	private int runk;	//����


	Student3(String name,int age,int glade, int runk){
		this.name=name;
		this.age = age;
		this.glade = glade;
		this.runk = runk;
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

	public int getGlade() {
		return glade;
	}

	public void setGlade(int glade) {
		this.glade = glade;
	}

	public int getRunk() {
		return runk;
	}

	public void setRunk(int runk) {
		this.runk = runk;
	}

	//���ȏЉ�\�b�h
	void introduction() {
		System.out.println("���̖��O��" + name +"�ł�");
		System.out.println("���̔N���" + age + "�ł�");
		System.out.println("���̐��т�" + glade +"�ł�");
		System.out.println("���̐��т�" + runk +"�ł�");
	}
	//�N��v�Z���\�b�h
	void ageCalculation() {
		age = age +1;
		System.out.println("����" + age + "�΂ɂȂ�܂����B");
	}



}
