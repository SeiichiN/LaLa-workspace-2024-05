package rpg;

public class Main2 {

	public static void main(String[] args) {
		Monster[] monsters = new Monster[3];
		monsters[0] = new Slime();
		monsters[1] = new Goblin();
		monsters[2] = new DeathBat();
		Hero h = new Hero();
		for (Monster m : monsters) {
			h.attack(m);
			m.run();
		}

	}

}
