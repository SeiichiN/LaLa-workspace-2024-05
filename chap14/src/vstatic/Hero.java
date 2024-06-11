package vstatic;

public class Hero {
	String name;
	int hp;
	static int money;
	
	public static void setRandomMoney() {
		Hero.money = (int) (Math.random() * 1000);
		int money = nibai(Hero.money);
	}
	
	public static int nibai(int money) {
		return money * 2;
	}
}
