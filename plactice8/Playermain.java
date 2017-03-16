package plactice8;

public class Playermain {
	String name;
	int hp;

	void sleep(){
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した。");
	}
	void sit(int sec){
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った。");
		System.out.println("HPが" + sec + "ポイント回復した。");
	}
	void slip(){
		this.hp -= 5;
		System.out.println(this.name + "は、ころんだ。");
		System.out.println(this.name + "は、5のダメージ。");
	}
	void run(){
		System.out.println(this.name + "は、逃げ出した。");

	}
}
