package work9;

public class Calc {
	public int getDivideCalcurate(int num) throws OddNumberException {
		int ans = num%2; 
		if(ans==0) {
			return ans;
		 }else {
			//���Z���ʂ���̂��߁A��O�������B
			throw new OddNumberException("��ł��B�Ǝ���O���������Ă��܂��B");
		 }
	}
}
	 
