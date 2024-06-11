package rpg.monsters;

import rpg.humans.Human;

public abstract class Monster {
	private String type;
	private int hp;
	private boolean living;
	
	public Monster(String type) {
		this.type = type;
		this.hp = 100;
		this.living = true;
	}
	
	public abstract void attack(Human h);

	private void dead() {
		System.out.println(this.type + "は死んだ");
		this.living = false;
	}
	public boolean isLiving() {
		return living;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
		if (this.hp <= 0) {
			this.dead();
		}
	}

	public String getType() {
		return type;
	}

	public String toString() {
		return this.type + ": " + this.hp;
	}

}
