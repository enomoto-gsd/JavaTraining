package sample;
/*8章章末課題
 * 車の役割を持つクラスを作成すること。
 * 車の役割にあうメソッドを3つ作成すること。
 * 車クラスを継承したスポーツカークラスを作成してメソッドを一つ追加すること。
 * オーディオインターフェースを作成すること。
 * オーディオインターフェースメソッドを1つ作成すること。
 * mainメソッドを持つクラスを一つ作り、上記で作成して車クラスのメソッドを実行すること。
 */
public class Car {
	int gas;
	int speed;
	String carNumber;
	
	void run() {
		System.out.println("走行を始めます");
	}
	void stop() {
		System.out.println("ブレーキします。");
	}
	void horn() {
		System.out.println("クラクションを鳴らします");
	}
}
