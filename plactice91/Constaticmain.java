package plactice91;

public class Constaticmain {
	public static void main(String[]args) {
		Constatic user = new Constatic();
		Constatic user2 = new Constatic();
		user.money += 100;
		Constatic.Trade();
		user2.money +=200;
		Constatic.Trade();
		System.out.println(user.money + user2.money);

	}
}
