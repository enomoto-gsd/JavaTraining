package Work7;

//課題
public class Car {
	private int gas;	 	 //ガソリン量
	private String maker;	 //車のメーカー
	private String number;   //ナンバー
	private int speed;		//スピード

	//コンストラクタ
	Car(int gas,String maker,String number, int speed){
		this.gas= gas;
		this.maker =maker;
		this.number = number;
		this.speed =speed;
	}

	//走行するメソッド
	void run() {
		if(gas >=20 || gas>=100) {
			System.out.println("走ります。");
			gas -=10;
			System.out.println("残りガソリン量は" +gas+ "です。");
		}else if(gas>20) {
			System.out.println("走ります。ガソリンが少なくなってきています。");
			gas -=10;
			System.out.println("残りガソリン量は" + gas + "です。");
		}else if(gas ==0){
			System.out.println("走行できません。給油してください");
		}
	}

	//加速するメソッド
    void speedUp() {
		System.out.println("加速します");
		speed +=10;
		gas -=5;
		System.out.println("現在のスピードは" + speed + "です。");
		System.out.println("残りガソリン量は" + gas + "です。");
	}

	//車の情報を表示するメソッド
	void showInfo() {
		System.out.println("車のメーカーは" + maker + "です。");
		System.out.println("車のnumberは" + number + "です。");
	}
}
