package rpg.monsters;

import java.util.Random;

import rpg.humans.Human;

public class Goblin extends Monster {
	private int damage;

	public Goblin(String type) {
		super(type);
		this.damage = 5;
	}

	@Override
	public void attack(Human h) {
		if (!this.isLiving()) { return; }
		if (h.isLiving()) {
			int damage = new Random().nextInt(this.getDamage());
			System.out.println(h.getName() + "への攻撃");
			System.out.println(damage + "のダメージを与えた");
			h.setHp(h.getHp() - damage);
		} else {
			System.out.println(h.getName() + "はもう死んでいる");
		}
		
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

}
