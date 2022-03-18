package work63;

public class Calc {
	
	public int calcAdd(int num1,int num2) {
		return num1+ num2;
		
	}
	
	public int calcDivide(int num1,int num2) {
		if(num2 ==0) {
			return -1;
		}else {
			return num1 /num2;
		}
	}
}
