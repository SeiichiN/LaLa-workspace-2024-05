package rpg;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		Matango m = new Matango('A');
		h.attack(m);
		
		Dancer d = new Dancer();
		d.attack(m);
	}

}
