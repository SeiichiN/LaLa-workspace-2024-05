package rpg;

public class Hero extends Character {
	public String name = "ミナト";
	int hp = 100;
	
	public Hero() {
		System.out.println("Heroのコンストラクタが動作");
	}
	@Override
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に１０ポイントのダメージを与えた");
		m.hp -= 10;
	}
	
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "はころんだ！");
		System.out.println("５のダメージ");
	}
	
	
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}

}
