package sample;

public class SportsCar extends Car implements Audio {
	
	@Override
	void run() {
		System.out.println("�Ԃ�葬������܂��B");
	}
	void speedUp() {
		System.out.println("�������܂�");
	}
	public void play() {
		System.out.println("���y�𗬂��܂��B");
	}
}
