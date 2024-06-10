package rpg.humans;

import rpg.monsters.Monster;

public abstract class Human {
	private String name;
	private int hp;
	
	public Human(String name) {
		this.name = name;
	}
	public abstract void attack(Monster m);
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public String getName() {
		return name;
	}
	
	
}
