package main;

import java.util.Random;
import java.util.Scanner;

public class GamePlayer {
	private int xpos;
	private int ypos;
	private boolean gameover;
	private GoblinPosition goblinPos;
	private MatangoPosition matangoPos;

	public GamePlayer() {
		this.xpos = new Random().nextInt(5);
		this.ypos = new Random().nextInt(5);
		this.gameover = false;
		this.goblinPos = new GoblinPosition();
		this.matangoPos = new MatangoPosition();
	}

	public boolean isGameover() {
		return gameover;
	}

	public void move() {
		System.out.print("n:北 s:南 w:西 e:東 q:終 > ");
		String dir = new Scanner(System.in).nextLine();
		switch (dir) {
		case "n":
			this.ypos -= 1;
			this.ypos = (this.ypos < 0) ? 0 : this.ypos;
			break;
		case "s":
			this.ypos += 1;
			this.ypos = (this.ypos > 4) ? 4 : this.ypos;
			break;
		case "w":
			this.xpos -= 1;
			this.xpos = (this.xpos < 0) ? 0 : this.xpos;
			break;
		case "e":
			this.xpos += 1;
			this.xpos = (this.xpos > 4) ? 4 : this.xpos;
			break;
		case "q":
			this.gameover = true;
		}
		printPosition();
		String mons = findMonster();
		if (mons != null) {
			System.out.println(mons + "が現れた!!");
		}
	}

	public void printPosition() {
		System.out.println("Y:" + ypos + " X:" + xpos);
	}

	public String findMonster() {
		if (this.xpos == goblinPos.getXpos() && this.ypos == goblinPos.getYpos()) {
			return "goblin";
		}
		if (this.xpos == matangoPos.getXpos() && this.ypos == matangoPos.getYpos()) {
			return "matango";
		}
		return null;
	}
}
