package plactice5;

public class ReturnValue {		//戻り値
	public static void main (String[]args){
		int currentlyHealth = health(200, 40);	//returnされたcHをcurrentlyHealthに代入している。右辺から処理していく。
		System.out.println(currentlyHealth);
		System.out.println("これは main method です。");
	}
	public static int health (int mH, int rD){
		int cH = mH - rD;
		System.out.println(cH);
		System.out.println("これは health method です。");
		return cH;		/*普段戻り値を使う場合は出力関連の命令は使われないのでは？と思う。本来は複雑化した内部処理を
		見分けやすくするためのものなので。今回の場合、main methodが出力、health methodが内部処理を担当するはず。*/

	}
}
