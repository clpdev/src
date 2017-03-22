package plactice91;

public class Constatic {
	int hp;
	String name;
	static int money;	//共通する事柄のために適当なクラスを一つ作るよりは静的メンバの方がバグやスパゲッティを避けられそう。ただ乱用はダメ。
	static void Trade(){
		System.out.println("ギルドからお金の支出があった。");	//マルチプレイで各インスタンスに何かを共有させる時にstatic
		money -= 100;
		System.out.println("現在の所持金は" + money);
	}
	Constatic() {
		// TODO 自動生成されたコンストラクター・スタブ　引数が宣言されていないと自動的にこれが表示される？
		hp = 100;
		name = "hooya";
		money = 300;
	}
}
