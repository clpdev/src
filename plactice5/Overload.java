package plactice5;

public class Overload {
	public static void main(String[]args){
		int curhealth = add(40, 60);
		String name = add("cl", "op");
		double state = add(5.4, 3.2);
		System.out.println("体力、合体敵、加速度は" + curhealth + name + state);
	}
	public static int add(int heal , int damage){
		int x = heal + damage;
		return x;
	}
	public static String add(String bo1, String bo2) {
		String bo3 = bo1 + bo2;
		return bo3;
	}
	public static double add(double cp, double op) {
		double acce = (cp - op)/2;
		return acce;
	}

	/*下の3つのメソッドの名前がaddに統一できているのは、仮引数の型がそれぞれ異なるため。
	 * これをオーバーロードという。メソッドの名前を統一するメリットはコードの読みやすさと
	 * 状態の管理が楽になることだと思う。
	 * 例えばRPGでレベルアップしたときのためにlevelupメソッドを作って、その中にint型のパラメータ用メソッド、
	 * string型の文章用メソッドを用意しておけば、経験値の管理用メソッドと合わせて、シーンの管理や
	 * バグフィックスが楽になるんじゃないかと思う。
	 *
	 * 今回の練習コードは引数に脈絡が全然ないけど統一された情報（プレイヤーの名前やパラメータ）などに
	 * 必要な部分ごとにメソッドを統一していけば良いんじゃないかと思う。例えば、int player, string player
	 * みたいなメソッドを作っておけば、イベントが起こるための条件の取得が楽になるかな？*/

}
