package nuk;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		Sword sword = new Sword("炎の剣");
		h.items[0] = sword;
		Matango m = new Matango();
		if (h.items[0] instanceof Sword) {
			((Sword)h.items[0]).attackWithSword(m);
		}
	}

}
