package rpg;

public class PoisonMatango extends Matango {
	int count;
	
	public PoisonMatango(char suffix) {
		super(suffix);
		this.count = 5;
	}
	
	public void attack(Hero h) {
		super.attack(h);
		if (this.count > 0) {
			System.out.println("更に毒の胞子をばらまいた");
			int damage = h.hp / 5;
			System.out.println(damage + "ポイントのダメージ");
			h.hp = h.hp - damage;
			this.count--;
		}
	}

}
