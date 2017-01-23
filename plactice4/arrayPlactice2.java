//配列の中の要素をループさせるにはインクリメントで増加させる以外の方法が必要。
package plactice4;

public class arrayPlactice2 {
	public static void main (String[]args){
		for(int i = 0; i < 5; i++){
			int[] math = {1, 3, 5, 7, 9};
			int x = math[0];
			System.out.println("" + x);
			x++;
		}
	}
}
