package javaIntermediateWork1;
/*mainメソッドからRobotFactoryクラスを呼び出して
 * Robotクラスのオブジェクトを作成
 * 上記の処理が終わったら「ロボットの作成が完了しました」という文字列を出力して完了
 */
public class SampleController {
	public static void main(String[] args) {
		
		Robot robo = RobotFactory.getCreateRobot("ロボット");
		System.out.println(robo.getName() + "を製造が完了しました");

	}

}
