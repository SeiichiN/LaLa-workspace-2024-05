package rpg.humans;

import rpg.monsters.Monster;

public abstract class Human {
	private String name;
	private int hp;
	private boolean living;
	
	public Human(String name) {
		this.name = name;
		this.hp = 100;
		this.living = true;
	}
	public boolean isLiving() {
		return living;
	}

	public abstract void attack(Monster m);
	
	private void dead() {
		System.out.println(this.name + "は死んでしまった");
		this.living = false;
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
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return this.name + ": " + this.hp;
	}
}
