package plactice11;

public class Monster {
	private String name;
	private int hp;
	private int def;

	public Monster() {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = "monster";
		this.hp = 50;
		this.def = 20;
	}

	public String getName(){
		return this.name;
	}

	public int getHp(){
		return this.hp;
	}

	public void setHp(int hp){
		this.hp = hp;
	}

	public int getDef(){
		return this.def;
	}
}
