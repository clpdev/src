package plactice5;

public class Arraymethod {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		arraymeth(array);
		//arint(1, 2, 3);
		//System.out.println(a + b + c);	これは基本形なので一つのメソッドからしか使えない。arraymethのabcとは違うアドレス。
	}
	public static void arraymeth(int[] array) {
		for(int value : array){
			System.out.println(value);
			array[1] = 100;		//このarray[1]は参照型なのでmainのarray[1]と同じアドレス。
		}
	}
	/*public static void arint(int a, int b, int c) {
		System.out.println(a + b + c);
		b = 100;
	}*/

	/*メモリやアドレスなんていう言葉が出てきたら参照型の変数と思ったほうが良いのかな？
	 	 参照型で指定した場合、ハードウェアに直接書き込んでいるのでスコープに関係なく変数の
	 	 書き換えができるのかな…多分*/
}
