package plactice91;

public class Consthero {
	String name;
	int hp;
	void attack(){

	}
	Consthero() {	//メソッド名とクラス名が完全に等しく、戻り値が宣言されていない（void,int等なし）時、コンストラクタは使える。
		// TODO 自動生成されたコンストラクター・スタブ
		this.hp = 100;
		name = "量産型勇者";
	}
	Consthero(String name){
		this.hp = 100;
		this.name = name;	//右辺のnameは引数から受け取ったnameで、左辺のnameはconstheroクラスのname
	}
}
