package main;

import java.util.Random;
import java.util.Scanner;

import rpg.humans.Human;
import rpg.monsters.Monster;

public class FightAll {
	private Monster[] monsters = new Monster[2];
	private Human[] humans = new Human[2];
	
	public FightAll(Human[] humans, Monster[] monsters) {
		this.humans = humans;
		this.monsters = monsters;
	}

	public void play() {
		while (true) {
			System.out.print("\n 1:戦う 2:逃げる 9:終了する 他:戦う > ");
			int num = new Scanner(System.in).nextInt();
			if (num == 2 || num == 9) { break; }
			for (Human h : humans) {
				System.out.println("\n" + h.getName() + "の攻撃");
				Monster m = selectMonster(monsters);
				h.attack(m);
			}
			for (Monster m : monsters) {
				System.out.println("\n" + m.getType() + "の攻撃");
				Human h = selectHuman(humans);
				m.attack(h);
			}
			printStatus(monsters, humans);
		}
		System.out.println("お疲れ様");
	}
	
	private void printStatus(Monster[] monsters, Human[] humans) {
		System.out.println();
		for (Monster m : monsters) {
			System.out.println(m);
		}
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
