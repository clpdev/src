package plactice4;

public class arrayPlactice2fix2 {
	public static void main(String[]args) {
		int[] score = {20, 30, 40, 50, 70};
		for(int value : score){ //この拡張命令は配列を１つづつ右にずらすときだけ使用する。
			System.out.println(value);
		}

	}
}
