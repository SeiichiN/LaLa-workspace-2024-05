package fifth;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		System.out.println(h1.hp);
		System.out.println(Hero.money);
		Hero.money = 1000;
		System.out.println(h1.money);
		System.out.println(h2.money);
		h1.money = 2000;
		System.out.println(Hero.money);
		System.out.println(h2.money);
	}

}
