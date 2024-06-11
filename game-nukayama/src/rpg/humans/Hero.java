package rpg.humans;

import java.util.Random;

import rpg.monsters.Monster;

public class Hero extends Human {
	private Sword sword;

	public Hero(String name) {
		super(name);
		this.sword = new Sword("炎の剣", 15);
	}

	@Override
	public void attack(Monster m) {
		if (!this.isLiving()) {
			return;
		}
		if (m.isLiving()) {
			int damage = new Random().nextInt(this.sword.getDamage());
			System.out.println(m.getType() + "への攻撃");
			System.out.println(damage + "のダメージを与えた");
			m.setHp(m.getHp() - damage);
		} else {
			System.out.println(m.getType() + "はもう死んでいる");
		}
	}

	public Sword getSword() {
		return sword;
	}

	public void setSword(Sword sword) {
		this.sword = sword;
	}

}
