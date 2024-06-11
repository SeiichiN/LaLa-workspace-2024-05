package rpg.humans;

import java.util.Random;

import rpg.monsters.Monster;

public class Wizard extends Human {
	private Wand wand;

	public Wizard(String name) {
		super(name);
		this.wand = new Wand("魔法の杖", 15);
	}

	@Override
	public void attack(Monster m) {
		if (!this.isLiving()) { return; }
		if (m.isLiving()) {
			int damage = new Random().nextInt(this.wand.getDamage());
			System.out.println(m.getType() + "への攻撃");
			System.out.println(damage + "のダメージを与えた");
			m.setHp(m.getHp() - damage);
		} else {
			System.out.println(m.getType() + "はもう死んでいる");
		}
	}

	public Wand getWand() {
		return wand;
	}

	public void setWand(Wand wand) {
		this.wand = wand;
	}

}
