package rpg;

public class Test {

	public static void main(String[] args) {
		SuperHero sh = new SuperHero();
		Matango m = new Matango();
		sh.attack(m);
		sh.fly();
		sh.land();
		sh.run();
	}

}
