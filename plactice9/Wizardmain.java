package plactice9;

public class Wizardmain {
	public static void main(String[]args){
		Hero h1 = new Hero();
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.hp =150;
		Wizard w1 = new Wizard();
		w1.hp = 50;
		w1.heal(h1);
		w1.heal(h2);	//ベホマラーってこんな感じかな？
	}

}
