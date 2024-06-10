package rpg.monsters;

import rpg.humans.Human;

public abstract class Monster {
	private String type;
	private int hp;
	
	public Monster(String type) {
		this.type = type;
	}
	
	public abstract void attack(Human h);

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getType() {
		return type;
	}
	
}
