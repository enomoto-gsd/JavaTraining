package javaintermediateWork2;

public class Truck implements CarInterface {
	public void breek() {
		System.out.println("トラックは停車します。");
	}
	public void accel() {
		System.out.println("トラックは発進します。");
	}
	public void back() {
		System.out.println("トラックはバックします。");
	}
}
