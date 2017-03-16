package plactice8;

import java.util.Random;

public class Plactice83main {	//ここはCleric
	String name;
	int hp = 50;
	final int mHP = 50;
	int mp = 10;
	final int mMP = 10;

	public void selfAid(){
		System.out.println(this.name + "は、セルフエイドを唱えた。");
		this.mp -= 5;	//thisを使うことでインスタンス同士の変数のぶつかりを避けられる。他にもメリットがあるかも？
		this.hp = this.mHP;	//thisを入れ忘れていたので入れるようにする。
		System.out.println(this.name + "は、hpが全回復した。");
	}

	public int pray(int time){	//ここからPlactice84
		System.out.println(this.name + "は、天に祈った。");
		int restoreMP = time + new Random().nextInt(3);	//Plactice2
		int actualrecover = Math.min(this.mMP - this.mp, restoreMP);	//Plactice2
		this.mp += actualrecover;
		System.out.println("MPが" + actualrecover + "回復した。");
		return actualrecover;	/*戻り値にactualrecoverを使うメリットがわからなかった。
		メインクラスではなくその他クラス間での利用価値がありそう。体力吸収系の操作とか。*/
	}

	public static void main(String[]args) {
		Plactice83main Cleric = new Plactice83main();
		Cleric.name = "hage";
		Cleric.mp = 5;
		Cleric.pray(3);
		System.out.println("現在のmpは" + Cleric.mp);
		Cleric.selfAid();

	}

}
