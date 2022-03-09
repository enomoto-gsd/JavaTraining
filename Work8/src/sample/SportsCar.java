package sample;

public class SportsCar extends Car implements Audio {
	
	@Override
	void run() {
		System.out.println("Ô‚æ‚è‘¬‚­‘–‚è‚Ü‚·B");
	}
	void speedUp() {
		System.out.println("‰Á‘¬‚µ‚Ü‚·");
	}
	public void play() {
		System.out.println("‰¹Šy‚ğ—¬‚µ‚Ü‚·B");
	}
}
