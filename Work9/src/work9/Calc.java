package work9;

public class Calc {
	public int getDivideCalcurate(int num) throws OddNumberException {
		int ans = num%2; 
		if(ans==0) {
			return ans;
		 }else {
			//除算結果が奇数のため、例外が発生。
			throw new OddNumberException("奇数です。独自例外が発生しています。");
		 }
	}
}
	 
