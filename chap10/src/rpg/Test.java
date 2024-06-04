package rpg;

public class Test {

	public static void main(String[] args) {
		SuperHero sh = new SuperHero();
		Matango m = new Matango('A');
		sh.fly();
		sh.attack(m);
		sh.land();
		sh.run();
	}

}
