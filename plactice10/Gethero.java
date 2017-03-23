package plactice10;

public class Gethero {
	private String name = "yusya";	//
	final static int MAX_HP = 999;
	int hp;
	final static int MAX_MP = 999;
	int mp;

	public String getName(){
		return this.name;	//getNameを呼んだメソッドに"yusya"を与える
	}

	public Gethero(String name, int hp, int mp) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
}
