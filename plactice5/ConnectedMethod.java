package plactice5;

public class ConnectedMethod {
	public static void main(String[] args) {
		System.out.println("----------");	//処理１
		methodA();
		System.out.println("----------");	//処理５
	}

	public static void methodA() {
		System.out.println("これはmethodAです。");	//処理２
		methodB();
		System.out.println("methodBを呼び出しています。");	//処理４
	}

	public static void methodB() {
		System.out.println("これはmethodBです。");	//処理３
	}
}
