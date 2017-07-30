package plactice10try;

public class Hero {
	private String name;
	private int hp;

	public int getHp(){
		return this.hp;
	}

	public String getName(){
		return this.name;
	}

	public void setHp(int hp){
		this.hp = hp;
	}

	public Hero() {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = "yusya";
		this.hp = 50;
	}
}
