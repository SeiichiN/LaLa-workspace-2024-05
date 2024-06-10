package rpg.monsters;

import rpg.characters.Hero;

public class Matango {
	private int hp = 50;
	private char suffix;
	
	public Matango() {
		this.suffix = 'A';
	}
	
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	
	public char getSuffix() {
		return this.suffix;
	}
	
	public void setSuffix(char suffix) {
		this.suffix = suffix;
	}
	
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println(h.getName() + "に10のダメージ");
	}

	public void run() {
		System.out.println
		  (this.suffix + "は、ぽぽぽっと逃げ出した");
	}

}
