package Work7;

public class Student {
	private String name;
	private int age;
	private String address; //�Z����ǉ�
	private String skill;
	private String lv;
	private String id;
	private int password;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress(){
		return address;
	}

	void setAddress(String address){
	    this.address = address;
	}
	//�ȉ��A�ۑ�B���낢��ȃ��\�b�h�𑝂₵�Ă݂�B

	//�Z�p�ƃ��x�����Z�b�g���郁�\�b�h�B
	void setSkill(String skill,String lv) {
		this.skill=skill;
		this.lv =lv;
	}

	//ID�ƃp�X���[�h���Z�b�g���郁�\�b�h�B
	public void setStudentInfo(String id,int password) {
		this.id = id;
		this.password=password;
	}

	 //
	 public String [] Appeal(String skill, String exp ,String status) {
		  String [] appealArr = new String[3];
		  appealArr[0] = skill;
		  appealArr[1] = exp;
		  appealArr[2] = status;
		  return appealArr;
	}

	 //hp��Ԃ����\�b�h
	 public String getHp(int hp) {
		 String telparse = String.valueOf(hp);
		 return telparse;
	 }

	 public static String Count(int num) {
		 String num2 = String.valueOf(num);
		 return num2;
	 }

	 //�ۑ�F�I�[�o�[���[�h
	 public String [] Appeal(String skill, String exp ,String status,String grade) {
		  String [] appealArr = new String[3];
		  appealArr[0] = skill;
		  appealArr[1] = exp;
		  appealArr[2] = status;
		  appealArr[3] = grade;
		  return appealArr;
	}


	void introduction() {
		System.out.println("���̖��O��" + name +"�ł�");
		System.out.println("���̔N���" + age + "�ł�");
	}

	void ageCalculation() {
		age = age +1;
		System.out.println("����" + age + "�΂ɂȂ�܂����B");
	}
}
