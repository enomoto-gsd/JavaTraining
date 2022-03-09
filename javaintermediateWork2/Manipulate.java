package javaintermediateWork2;

public class Manipulate {
	public static void main(String[] args) {
		Truck tr = new Truck();
		SportCar sp = new SportCar();
		
		Driver driver = new Driver();
		driver.doManipulate(tr);
		driver.doManipulate(sp);

	}

}
