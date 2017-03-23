package plactice10;

public class Getmain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Gethero yusya = new Gethero("勇者", 300, 200);	//heroのインスタンス
		Getking hGetking = new Getking();	//kingのインスタンス
		hGetking.talk(yusya);	//kingclass.talk ~ hero.getName ~ private string name
	}
	/*クラスからクラスを呼び出す場合、今まではアクセス修飾子なしでやっていたけれど
	 * (package private = 同パッケージ内からしか呼び出せない)、アクセス修飾子を
	 * 使うことでクラス間でのフィールドのぶつかりの影響を少なくできる。
	 * 代わりにgetterやsetterと呼ばれるprivateなメンバの呼び出し方法が必要。*/

}
