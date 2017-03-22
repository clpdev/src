package plactice91;

public class Constex {
	int hp;
	String name;
	Constex(String exhero) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.hp = 100;
		this.name = "exyuusya";
	}
	Constex(){
		//this.Constex("Dummy");	this.Constexだとこの場合plactice91.Constexみたいな表現になるので不可？
		this("Dummy");		//こっちはコンストラクタが初期値の設定のためにあるとしても、結局クラスからクラスを呼び出している感じ？
	}

}
