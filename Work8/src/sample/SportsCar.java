package sample;

public class SportsCar extends Car implements Audio {
	
	@Override
	void run() {
		System.out.println("車より速く走ります。");
	}
	void speedUp() {
		System.out.println("加速します");
	}
	public void play() {
		System.out.println("音楽を流します。");
	}
}
