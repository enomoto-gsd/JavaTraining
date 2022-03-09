package javaintermediateWork2;

public class Driver {
	//インターフェースCarInterface型をつくることによって、制限を緩くする。実態がどちらであっても実行される。
	public void doManipulate(CarInterface c) {
		c.accel();
		c.back();
		c.breek();
	}

}
