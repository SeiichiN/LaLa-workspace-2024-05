package rpg.monsters;

import java.util.Random;

import rpg.humans.Human;

public class Matango extends Monster {
	private Poison poison;

	public Matango(String type) {
		super(type);
		this.poison = new Poison("毒液");
	}

	@Override
	public void attack(Human h) {
		if (!this.isLiving()) { return; }
		if (h.isLiving()) {
			int damage = new Random().nextInt(this.poison.getDamage());
			System.out.println(h.getName() + "への毒攻撃");
			System.out.println(damage + "のダメージを与えた");
			h.setHp(h.getHp() - damage);
		} else {
			System.out.println(h.getName() + "はもう死んでいる");
		}
	}

	public Poison getPoison() {
		return poison;
	}

	public void setPoison(Poison poison) {
		this.poison = poison;
	}

}
