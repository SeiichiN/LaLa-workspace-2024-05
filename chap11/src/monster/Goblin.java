package monster;

public class Goblin {
	String name = "ゴブリン";
	
	public void attack(Hero h) {
		System.out.println(this.name + "の攻撃!");
		System.out.println(h.name + "に10ポイントのダメージ");
	}
}
