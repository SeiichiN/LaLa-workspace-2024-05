package monster;

public class Main {

	public static void main(String[] args) {
		Goblin g = new Goblin();
		g.attack();
		g.run();
		
		Werewolf w = new Werewolf();
		w.attack();
		w.run();
		
		DeathBat d = new DeathBat();
		d.attack();
		d.run();
	}

}
