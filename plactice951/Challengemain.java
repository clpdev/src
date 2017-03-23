package plactice951;

public class Challengemain {
	public static void main(String[]args) {
		Cleric mage = new Cleric("mage", 40, 5);
		Cleric mage2 = new Cleric("mage2");
		mage.selfAid();
		mage.pray(3);
		mage2.selfAid();
		mage2.pray(2);

	}
}
