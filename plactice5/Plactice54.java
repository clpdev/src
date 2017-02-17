package plactice5;


public class Plactice54 {
	public static void main(String[]args) {
		System.out.println("三角形の面積は" + calcTriangleAria(10.0, 5.0) + "平方cmです。");
		System.out.println("円の面積は" + calccircleAria(5.0) + "平方cmです。");
		/*calccircleAria(5.0)とcalcTriangleAria(10.0, 5.0)はdoubleで適当な変数を用意してそこに
		 * 代入したほうがいいかも。*/
	}
	public  static double calcTriangleAria(double bottom, double height) {
		double x = (bottom * height)/2;
		return x;
	}
	public  static double calccircleAria(double radius) {
		double y = radius * radius * 3.14;
		return y;
	}
}
