package plactice3;

public class jogasimu {
	public static void main(String[] args) {
		char a = 'a';
		char b = 'a';
		char c = 'a';
		char d = 'a';
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <15; j++) {
				for (int k = 0; k < 7; k++) {
					for (int l = 0; l < 26; l++) {
						System.out.print(a + "" + b + "" + c + "" + d);
						System.out.print(" ");
						d++;
					}
					System.out.println();
					c++;
					d = 'a';
				}
				b++;
				c = 'a';
				d = 'a';
			}
			a++;
			b = 'a';
			c = 'a';
			d = 'a';
		}
	}
}
