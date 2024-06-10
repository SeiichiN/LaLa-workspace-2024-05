package main;

import rpg.humans.Human;
import rpg.monsters.Monster;

public class Fight {
	private Human human;
	private Monster monster;
	private boolean end;
	
	public Fight() {
		this.end = false;
	}

	public void start() {
		while (this.end == false) {
			monster.attack(human);
			if (human.getHp() <= 0) {
				this.end = true;
			}
			human.attack(monster);
			if (monster.getHp() <= 0) {
				this.end = true;
			}
		}
	}
	public Human getHuman() {
		return human;
	}

	public void setHuman(Human human) {
		this.human = human;
	}

	public Monster getMonster() {
		return monster;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
	}
	
}
