package main;

import java.util.Random;

public abstract class MonsterPosition {
	private int xpos;
	private int ypos;
	
	public MonsterPosition() {
		this.xpos = new Random().nextInt(5);
		this.ypos = new Random().nextInt(5);
	}

	public int getXpos() {
		return xpos;
	}

	public int getYpos() {
		return ypos;
	}
}
