package plactice11;

public class SuperHero extends Hero {
	private boolean flying;

	public void fly(Hero hero){
		this.flying = true;
		System.out.println(hero.getName() + "は空を飛んだ。");
	}

	public void land(Hero hero) {
		this.flying = false;
		System.out.println(hero.getName() + "は着地した。");
	}

	public void attack(Monster monster){
		final int plusdmg = 5;
		int acthp = monster.getHp() - plusdmg;
		monster.setHp(acthp);
		System.out.println(plusdmg + "の追加ダメージ！");
		System.out.println(monster.getName() + "のHPは" + acthp + "になった。");

		/*親クラスと同じ名前のメソッドを定義することを”オーバーライド”という。
		 *今回の場合、superheroのインスタンスからはheroクラスのattackメソッドを
		 *利用できない定義の上書きが起こっている。*/
	}
}
/*継承は便利だけど実際使うとなると、もとのクラスのインスタンスと継承されたクラスのインスタンスが
 * 重複してしまうのではないか？ガベージコレクションがなんとかしてくれる？*/
