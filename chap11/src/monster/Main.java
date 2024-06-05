package monster;

public class Main {

	public static void main(String[] args) {
		Hero hero = new Hero();
		Goblin goblin = new Goblin();
		goblin.attack(hero);
		
		Werewolf w = new Werewolf();
		w.attack(hero);

	}

}
