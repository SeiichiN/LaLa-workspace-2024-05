package nuk;

public class Sword extends Item{
	int damage = 20;
	
	public Sword(String name) {
		super(name);
	}

	public void attackWithSword(Matango m) {
		System.out.println(super.name + "による攻撃!");
		System.out.println(this.damage +"のダメージを与えた");
		m.hp -= this.damage;
	}
}
