package rpg.characters;

import rpg.monsters.Matango;

public class Hero {
	private int hp;
	private String name = "ミナト";
	private Sword sword;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println
		  ("お化けきのこ" + m.getSuffix() +"から2ポイントの反撃を受けた");
		this.hp -= 2;
		if (this.hp <= 0) {
			this.die();
		}
	}
	
	private void die() {
		System.out.println(this.name + "は死んでしまった");
		System.out.println("GAME OVERです");
	}
	
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した");
	}
}
