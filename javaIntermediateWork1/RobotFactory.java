package javaIntermediateWork1;

public class RobotFactory {
	String name ; //–¼‘O
	

	public static Robot getCreateRobot(String name) {
		Robot robo = new Robot();
		robo.setName(name);
		robo.introduction();
		return robo;
	}
	
	


	

}
