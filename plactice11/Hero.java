package plactice11;

public class Hero {
	private String name;
	private int hp;
	private int atk;

	public String getName(){
		return this.name;
	}

	public void attack(Monster monster) {
		while (monster.getHp() > 0) {

			System.out.println(this.name + "の攻撃！");
			int recdmg = this.atk / 2 - monster.getDef() / 4;
			int acthp = monster.getHp() - recdmg;
			monster.setHp(acthp);
			System.out.println(monster.getName() + "は" + recdmg + "ダメージを受けた！");

			if(monster.getHp() < 0){acthp = 0;}

			System.out.println(monster.getName() + "のHP" + "は" + acthp + "になった。");
			SuperHero otomo = new SuperHero();
			otomo.attack(monster);

		}
	}

	public Hero() {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = "yusya";
		this.hp = 100;
		this.atk = 50;
	}
}
