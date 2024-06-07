package rpg;

public class Main {

	public static void main(String[] args) {
		// Character c = new Wizard();
		Character c = new Hero();
		Matango m = new Matango();

		if (c instanceof Wizard) { // c == Wizard
			Wizard w = (Wizard) c;			
			w.name = "アサカ";
			w.attack(m);
			w.fireball(m);
		} else {
			c.attack(m);
		}


	}

}
