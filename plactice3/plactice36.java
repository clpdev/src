package plactice3;

public class plactice36 {
	public static void main(String[]args) {
		System.out.println("【数あてゲーム】");
		int ans = new java.util.Random().nextInt(10);
		for(int k = 0; k < 5; k++){
			System.out.println("０から９の数字を入力してください。");
			int num = new java.util.Scanner(System.in).nextInt();
			if(ans == num){
				System.out.println("アタリ！！");
			} else {
				System.out.println("ハズレ！！");
			}
		}
		System.out.println("ゲームを終了します。");

	}
}
