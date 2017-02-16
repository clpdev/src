package plactice5;

public class Overload2 {
	public static void main(String[] args) {
		System.out.println("" + value(20, 60));
	}

	public static int value(int a, int b) {	//このタイミングでmain methodのvalueの値がa,bに入る。
		a = 1; b = 2;
		int buy = a + b;
		return buy;
	}

	public static int value(int a, int b, int c) {
		int buy = a + b + c;
		return buy;
	}
}

/*こちらのオーバーロードは引数の中身の数の違いを認識できるタイプ。ただ、こっちの方は正直なところ使いみちが
 * 思いつかない。しいて言うなら、イベント発生時のパラメータ数の更新とか？でも配列でいいしなぁ…*/
