package rpg;

public class Hero {
	// フィールド(変数)
	String name;
	int hp;
	Sword sword;
	
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	
	public Hero() {
		this("ダミー");
	}
	
	// メソッド
	public void attack() {
		System.out.println
		  (this.name + "は" + this.sword.name + "で攻撃した！");
		System.out.println
		  ("敵に" + this.sword.damage + "ポイントのダメージを与えた!");
	}

}
