package rpg.monsters;

public class Matango {
	private int hp = 50;
	private char suffix;
	
	public Matango() {
		this.suffix = 'A';
	}
	
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	
	public char getSuffix() {
		return this.suffix;
	}
	
	public void setSuffix(char suffix) {
		this.suffix = suffix;
	}
	
	public void attack() {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
	}

	public void run() {
		System.out.println
		  (this.suffix + "は、ぽぽぽっと逃げ出した");
	}

}
