package rpg.humans;

import rpg.monsters.Monster;

public class Wizard extends Human {
	private Wand wand;

	public Wizard(String name) {
		super(name);
		this.wand = new Wand("魔法の杖", 15);
	}

	@Override
	public void attack(Monster m) {
		System.out.println(m.getType() + "への攻撃");
		System.out.println 
		  (this.wand.getDamage() + "のダメージを与えた");
		m.setHp(m.getHp() - this.wand.getDamage());
	}

	public Wand getWand() {
		return wand;
	}

	public void setWand(Wand wand) {
		this.wand = wand;
	}

}
