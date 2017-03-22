package plactice9;

public class Hasahero {
		String name = "yuusya";
		int hp = 100;
		Hasasword kenn = new Hasasword();
		void attack(){
			System.out.println("kougeki" + this.kenn.damage + "dame-ji");	//ここにthisを入れないとほかのインスタンスに影響が出ると思う。
		}
		void status(){
			System.out.println("soubi" + this.kenn.name + "." + "tairyoku" + this.hp);		//上に同じ
		}
}
