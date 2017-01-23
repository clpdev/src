package plactice3;

public class namae {
	public static void main(String[]args) {
		String name ="茂木";
		String message;
		message = name + "こんにちは！！";
		System.out.println(message);

		int old = 23;
		int age = 24;
		int big = Math.max(old, age);
		System.out.println(old + "と" + age  +"で大きい方は" + big +"です。");

		int ransu = new java.util.Random().nextInt(old);
		System.out.println("あなたの年齢は" + ransu + "よりは上ですね？");

		System.out.println("あなたの名前を入力してください。");
		String input = new java.util.Scanner( System.in ) .nextLine();
		System.out.println("あなたの年齢を入力してください。");
		int getscr = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ、" + getscr + "歳の" + input +"さん。");
	}
}
