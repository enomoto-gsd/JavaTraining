package model;

public class HumanManager {
	public static Human getHuman(String name,String age) {
		int intAge = Integer.parseInt(age);
		return new Human(name,intAge);
	}
}
