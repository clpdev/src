package plactice6;

public class Calc {
	public static void main(String[]args){
		int a = 10;
		int b = 2;
		int total = CalcLogic.tasu(a, b);
		int delta = CalcLogic.hiku(a, b);
		plactice5.ReturnValue.health(200, 40);	//パッケージ名.クラス名.メソッド名の順。
		System.out.println("足すと" + total + "引くと" + delta);

	}

}
