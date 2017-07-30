package plactice10;

public class Gethero {
	private String name = "yusya";	//
	final static int MAX_HP = 999;
	int hp;
	final static int MAX_MP = 999;
	int mp;

	public String getName(){
		return this.name;	//getNameを呼んだメンバに"yusya"を与える。getter
	}

	public void setName(String name){
		this.name = name;	//setNameを呼んだメンバから新しく(順番にもよる)名前を受け取る。setter
	}

	public Gethero(String name, int hp, int mp) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
}
/*setter,getterを使うとクラス名、メソッド名の被りでもしない限り仕様変更が楽になる？
 * setterは入力処理のパッケージ、クラスから。getterは他のインスタンスへ。
 * という風に使い分ける？
 *
 * 正直この2つは、実際に使っていった方がわかりやすいかもしれない。*/