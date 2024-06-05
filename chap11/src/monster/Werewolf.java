package monster;

public class Werewolf extends WalkingMonster {
	String name = "ワーウルフ";
	
	public void attack(Hero h) {
		System.out.println(this.name + "の攻撃");
		System.out.println(h.name + "に５ポイントのダメージ");
		h.hp -= 5;
	}

	@Override
	public void attack() {
		System.out.println(this.name + "の攻撃");
	}
}
