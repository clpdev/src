package plactice4;

public class DimensionArray {
	public static void main(String[]args) {
		int[][] score = new int [2][3];//2次元配列だと要素の数が膨大になるのでこの形で記述する。
		score[0][0] = 40;
		score[0][1] = 50;
		score[0][2] = 60;
		score[1][0] = 80;
		score[1][1] = 60;
		score[1][2] = 70;
		for(int i = 0; i < 2; i++){	//2次元配列だと他のスコープでも使う可能性があるので変数を外に出せるといいかも。
			for(int j = 0; j < 3; j++){
				System.out.println(score[i][j]);
			}
		}

	}
}
