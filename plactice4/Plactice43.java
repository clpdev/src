package plactice4;

public class Plactice43 {
	public static void main(String[]args) {
		int[] count = null;
		float[] height = { 173.1f, 175.0f };
		System.out.println(count[1]); //NullPointerException
		System.out.println(height[2]); //ArrayIndexOutOfBoundsException
	}
}
