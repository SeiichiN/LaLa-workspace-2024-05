package rpg.humans;

public abstract class Item {
	private String name;
	private int damage;
	
	public Item(String name, int damage) {
		this.name = name;
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public int getDamage() {
		return damage;
	}
	
}
