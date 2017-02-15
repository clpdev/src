package plactice5;

public class MethodArgument {	//argument == 引数
	public static void main(String[]args){
		System.out.println("methodをよびだします。");
		hello("C");
		hello("L");
		hello("O");
		System.out.println("methodの呼び出しが終了しました。");
		add("C", "O");
		add("C", "L");	//引数に複数の値がある場合順番をmethodに合わせる。値の数にはまだ言及されていないのでなにかあるかな？
	}
	public static void hello(String name) {
		System.out.println(name + "機体のパーツ");

	}
	public static void add(String FG, String SG) {
		System.out.println(FG + "と" + SG + "のパーツをGETしました。");

	}
}
