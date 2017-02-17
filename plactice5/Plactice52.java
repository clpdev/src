package plactice5;

public class Plactice52 {
	public static void main(String[]args) {

		email("today", "javavava", "hareteru");

	}
	public static void email(String title, String address, String text){
		//text = new java.util.Scanner(System.in).next();	実際はこんな感じで使うのではないかと思う。
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);

	}
}
