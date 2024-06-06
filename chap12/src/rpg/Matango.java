package rpg;

public class Matango {
	int hp = 50;
	char suffix;
	
	public Matango() {
		this.suffix = 'A';
	}
	
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	
	public void attack() {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
	}

}
