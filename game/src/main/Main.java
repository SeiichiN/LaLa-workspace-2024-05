package main;

import java.util.Random;
import java.util.Scanner;

import rpg.humans.Hero;
import rpg.humans.Human;
import rpg.humans.Wizard;
import rpg.monsters.Goblin;
import rpg.monsters.Matango;
import rpg.monsters.Monster;

public class Main {

	public static void main(String[] args) {
		Monster[] monsters = new Monster[2];
		monsters[0] = new Matango("マタンゴ");
		monsters[1] = new Goblin("ゴブリン");
		Human[] humans = new Human[2];
		humans[0] = new Hero("ミナト");
		humans[1] = new Wizard("アサカ");
		while (true) {
			System.out.println("1:戦う 2:逃げる 9:終了する 他:戦う");
			int num = new Scanner(System.in).nextInt();
			if (num == 2 || num == 9) { break; }
			for (Human h : humans) {
				System.out.println(h.getName() + "の攻撃");
				Monster m = selectMonster(monsters);
				h.attack(m);
			}
			for (Monster m : monsters) {
				Human h = selectHuman(humans);
				m.attack(h);
			}
			printStatus(monsters, humans);
		}
		System.out.println("お疲れ様");
	}
	
	public static void printStatus(Monster[] monsters, Human[] humans) {
		for (Monster m : monsters) {
			System.out.println(m);
		}
		for (Human h : humans) {
			System.out.println(h);
		}
	}
	
	public static Human selectHuman(Human[] humans) {
		int num = new Random().nextInt(2);
		return humans[num];
	}

	public static Monster selectMonster(Monster[] monsters) {
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
