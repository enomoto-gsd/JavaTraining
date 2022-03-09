package work9;

/*9章まとめ課題
 * 割り算の機能を提供するクラスを作成します。
 * 割り算のメソッドを作成します。
 * 割り算の結果が個数の場合は割り算の結果を、奇数の場合は独自例外で奇数となった
 * ことを呼び出し元に通知する処理を追加します。
 * 完成したら実行して、例外の発生を検知できるかを確認することｌ。
 */
public class RunCalculation {
	public static void main(String[] arggs) {
		Calc c = new Calc();
		try {
		   int ans = c.getDivideCalcurate(3);
		   System.out.println(ans+"は偶数です。");
		}catch(OddNumberException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
