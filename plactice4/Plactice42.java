package plactice4;

public class Plactice42 {
	public static void main(String[]args) {
		int[] moneyList = new int[3]; //配列に{}を使うと巨大な配列を扱う時に困りそうなので
		moneyList[0] = 121902;
		moneyList[1] = 8302;
		moneyList[2] = 55100; //短い配列の場合は{}を使った記述法のほうが良いかもしれない
		for(int i = 0; i < 3; i++){
			System.out.println(moneyList[i]);
		}
	}
}
