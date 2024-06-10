package rpg.monsters;

public class Poison {
	private String name;
	private int damage;
	
	public Poison(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public String getName() {
		return name;
	}
	
}
