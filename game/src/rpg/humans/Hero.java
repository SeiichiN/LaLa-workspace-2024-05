package rpg.humans;

import rpg.monsters.Monster;

public class Hero extends Human {
	private Sword sword;

	public Hero(String name) {
		super(name);
		this.sword = new Sword("炎の剣", 15);
	}

	@Override
	public void attack(Monster m) {
		System.out.println(m.getType() + "への攻撃");
		System.out.println
		  (this.sword.getDamage() + "のダメージを与えた");
		m.setHp(m.getHp() - this.sword.getDamage());
	}

	public Sword getSword() {
		return sword;
	}

	public void setSword(Sword sword) {
		this.sword = sword;
	}

}
