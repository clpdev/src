package plactice8;

public class Worldmain {
	public static void main(String[]args){
		Playermain jack = new Playermain();	//インスタンスの生成を行わないと元のクラスのメソッドは使えない。
		jack.name = "ジャック";	//上記に加えて生成なしでは変数の値の設定もできない→これらはフィールドと言われるらしい
		jack.hp = 100;

		Enemymain kinoko = new Enemymain();
		kinoko.hp = 50;
		kinoko.suffix = 'A';

		System.out.println(jack.name + "が誕生");
		jack.sit(5);
		jack.slip();
		jack.sit(25);
		kinoko.run();
		jack.run();

	}
}
