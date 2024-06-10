package nuk;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		Sword sword = new Sword("炎の剣");
		h.item = sword;
		Matango m = new Matango();
		if (h.item instanceof Sword) {
			((Sword)h.item).attackWithSword(m);
		}
	}

}
