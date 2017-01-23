package plactice3;

public class rist31fix {
	public static void main(String[]args) {

		int tenkiState;
		boolean tenki = true;

		for (int i = 0; i < 3; i++) {

		System.out.println("今日の天気は？");
		System.out.println("晴れなら1、雨なら2。");

		tenkiState = new java.util.Scanner(System.in).nextInt();

			if(tenkiState == 1){
				System.out.println("洗濯をして散歩に行きましょう。");
			}
			else if(tenkiState == 2){
				System.out.println("家でDVDを見ましょう。");
			}
			else{
				System.out.println("入力エラーです。");
			}
		}
	}
}
