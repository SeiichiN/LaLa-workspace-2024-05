package rpg.monsters;

import rpg.humans.Human;

public class Goblin extends Monster {
	private int damage;

	public Goblin(String type) {
		super(type);
		this.damage = 5;
	}

	@Override
	public void attack(Human h) {
		System.out.println(h.getName() + "への攻撃");
		System.out.println(this.getDamage() + "のダメージを与えた");
		h.setHp(h.getHp() - this.getDamage());
		
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

}
