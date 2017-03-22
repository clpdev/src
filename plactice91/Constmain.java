package plactice91;

public class Constmain {
	public static void main(String[]args) {
		Consthero h = new Consthero();
		System.out.println(h.hp + h.name);
		Consthero h1 = new Consthero("yuusya");	//インスタンスの生成の際にコンストラクタに引数の情報を渡す。
		System.out.println(h1.hp + h1.name);
		/*コンストラクタを使ってインスタンスの生成をする時、コンストラクタをオーバーロードして、引数無しの
		 * 同名コンストラクタをダミーとして記述しておくと便利かもしれない。p.355^p.358
		 * 今までインスタンスをコンストラクタの記述無しで使用できていたのは、JAVAの特例で
		 * 引数、処理内容なしのデフォルトコンストラクタがコンパイル時に自動生成されていたから。*/
	}
}
