package plactice9;

import java.util.Random;

public class Wizard {
	String name;
	int hp;
	void heal(Hero h){
		int recoverHealth = 10 + new Random().nextInt(5);;
		h.hp += recoverHealth;
		System.out.println("HPを" + recoverHealth + "回復した。");
	}
}
