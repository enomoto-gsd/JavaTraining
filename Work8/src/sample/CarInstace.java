package sample;

public class CarInstace {
	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		car.stop();
		car.horn();
		
		SportsCar sc = new SportsCar();
		sc.run();
		sc.speedUp();
		sc.play();
	}

}
