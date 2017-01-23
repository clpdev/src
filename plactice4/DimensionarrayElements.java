package plactice4;

public class DimensionarrayElements {
	public static void main(String[]args) {
		int[][] scores = { {10, 20, 30} ,{30, 40, 50} };
		System.out.println(scores.length);	//2次元配列は実質的には配列の配列なので実行の順番は先に記述された方から。
		System.out.println(scores[0].length);	//1つ目の配列の[0]となっているところは配列の長さまでなら数字の値はどれでも良い

	}
}
