package sample;

public class Earth {
	public static void main(String[]args) {
		Animal a = new Animal();
		a.run();
		
		Human h = new Human();
		h.run();
		h.speak();
		
		Student s = new Student();
		s.run();
		s.speak();
		s.study();
	}
}
