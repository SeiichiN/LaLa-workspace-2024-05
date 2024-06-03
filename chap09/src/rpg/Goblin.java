package rpg;

public class Goblin {
	String name;
	int hp;
	
	public Goblin() {
		this("名無し");
	}
	
	public Goblin(String name) {
		this.name = name;
		this.hp = 70;
	}
}
