package rpg.monsters;

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
			System.out.println(h.getName() + "への毒攻撃");
			System.out.println
			  (this.poison.getDamage() + "のダメージを与えた");
			h.setHp(h.getHp() - this.poison.getDamage());
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
