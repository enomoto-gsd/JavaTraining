package Work7;

//�ۑ�
public class Car {
	private int gas;	 	 //�K�\������
	private String maker;	 //�Ԃ̃��[�J�[
	private String number;   //�i���o�[
	private int speed;		//�X�s�[�h

	//�R���X�g���N�^
	Car(int gas,String maker,String number, int speed){
		this.gas= gas;
		this.maker =maker;
		this.number = number;
		this.speed =speed;
	}

	//���s���郁�\�b�h
	void run() {
		if(gas >=20 || gas>=100) {
			System.out.println("����܂��B");
			gas -=10;
			System.out.println("�c��K�\�����ʂ�" +gas+ "�ł��B");
		}else if(gas>20) {
			System.out.println("����܂��B�K�\���������Ȃ��Ȃ��Ă��Ă��܂��B");
			gas -=10;
			System.out.println("�c��K�\�����ʂ�" + gas + "�ł��B");
		}else if(gas ==0){
			System.out.println("���s�ł��܂���B�������Ă�������");
		}
	}

	//�������郁�\�b�h
    void speedUp() {
		System.out.println("�������܂�");
		speed +=10;
		gas -=5;
		System.out.println("���݂̃X�s�[�h��" + speed + "�ł��B");
		System.out.println("�c��K�\�����ʂ�" + gas + "�ł��B");
	}

	//�Ԃ̏���\�����郁�\�b�h
	void showInfo() {
		System.out.println("�Ԃ̃��[�J�[��" + maker + "�ł��B");
		System.out.println("�Ԃ�number��" + number + "�ł��B");
	}
}
