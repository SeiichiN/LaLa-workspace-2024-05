package rpg;

public class Hero {
	String name = "ミナト";
	int hp = 100;
	
	public Hero() {
		System.out.println("Heroのコンストラクタが動作");
	}
	
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "はころんだ！");
		System.out.println("５のダメージ");
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた！");
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
}
