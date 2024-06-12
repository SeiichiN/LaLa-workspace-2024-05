package rensyu2;

import java.util.Random;

/**
 * 練習 8
 */
public class Cleric {
	String name;
	int hp = 50;
	static final int MAX_HP = 50;
	int mp = 10;
	static final int MAX_MP = 10;
	
	public void selfAid() {
		this.mp -= 5;
		this.hp = this.MAX_HP;
		System.out.println(this.name + "は、魔法セルフエイドを使った！");
		System.out.println("HPを" + this.hp + "に回復した");
		System.out.println("MPを5消費した");
	}
	
	public int pray(int sec) {
		int mpOrg = this.mp;
		int correction = new Random().nextInt(3);
		int recovery = sec + correction;
		this.mp += recovery;
		if (this.mp > this.MAX_MP) {
			this.mp = this.MAX_MP;
		}
		System.out.println(this.name + "は" + sec + "秒祈った！");
		System.out.println("MPが" + this.mp + "に回復した");
		return this.mp - mpOrg;  // 実際の回復量
	}
}
