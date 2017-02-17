package plactice5;

public class Plactice53 {
	public static void main(String[] args) {
		email("today", "javavava", "hareteru");
		email("hogegege", "hongeeee");
	}

	public static void email(String title, String address, String text) {
		//text = new java.util.Scanner(System.in).next();	実際はこんな感じで使うのではないかと思う。mainに入力フォームはいらない。
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);

	}
	public static void email( String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("本文：" + text);

	}
}
