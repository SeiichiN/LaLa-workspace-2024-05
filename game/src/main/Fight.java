package main;

import java.util.Random;
import java.util.Scanner;

import rpg.humans.Human;
import rpg.monsters.Monster;

public class Fight {
	private Monster monster;
	private Human[] humans = new Human[2];

	public Fight(Human[] humans, Monster monster) {
		this.humans = humans;
		this.monster = monster;
	}

	public void play() {
		while (true) {
			System.out.print("\n 1:戦う 2:逃げる 9:終了する 他:戦う > ");
			int num = new Scanner(System.in).nextInt();
			if (num == 2 || num == 9) {
				break;
			}
			for (Human h : humans) {
				System.out.println("\n" + h.getName() + "の攻撃");
				h.attack(this.monster);
			}
			System.out.println("\n" + this.monster.getType() + "の攻撃");
			Human h = selectHuman(humans);
			this.monster.attack(h);
			printStatus(monster, humans);
		}
		System.out.println("お疲れ様");
	}

	private void printStatus(Monster monster, Human[] humans) {
		System.out.println();
		System.out.println(monster);
		for (Human h : humans) {
			System.out.println(h);
		}
	}

	private Human selectHuman(Human[] humans) {
		int num = new Random().nextInt(2);
		return humans[num];
	}

	private Monster selectMonster(Monster[] monsters) {
		System.out.println("どのモンスターと戦いますか？");
		for (int i = 0; i < monsters.length; i++) {
			if (monsters[i].isLiving()) {
				System.out.print(i + ":" + monsters[i].getType() + " ");
			}
		}
		System.out.print("> ");
		int no = new Scanner(System.in).nextInt();
		return monsters[no];
	}
}
