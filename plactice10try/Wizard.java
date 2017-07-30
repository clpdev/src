package plactice10try;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand = new Wand("heal stuff");	//本だと変数宣言までしか書かれていないのでインスタンスを生成した

	public void heal(Hero hero){
		int basePoint = 10;
		int recoverPoint = (int) (basePoint * this.wand.getPower());
		hero.setHp(hero.getHp() + recoverPoint);
		System.out.println(hero.getName() + "のHPを" + recoverPoint + "回復した。");
	}

	public void setName(String name){
		if(name.length() <= 2 || name == null){
			throw new IllegalArgumentException("名前が短すぎる。");
		}
		this.name = name;
	}

	public void setHp(int hp){
		if(hp < 0){
			hp = 0;
			throw new IllegalArgumentException("HPが尽きています。");
		}
		this.hp = hp;
	}

	public void setMp(int mp){
		if(mp < 0){
			mp = 0;
			throw new IllegalArgumentException("MPが尽きています。");
		}
		this.mp = mp;
	}

	public void setWand(Wand wand){
		if(wand == null){
			throw new IllegalArgumentException("この杖は不正な杖だ");
		}
		this.wand = wand;
	}

	public Wizard(String name) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.hp = 30;
		this.mp = 20;
		this.name = name;
	}
}
