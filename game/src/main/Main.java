package main;

import rpg.humans.Hero;
import rpg.humans.Wizard;
import rpg.monsters.Goblin;
import rpg.monsters.Matango;

public class Main {

	public static void main(String[] args) {
		Matango m = new Matango("マタンゴ");
		Goblin g = new Goblin("ゴブリン");
		Hero h = new Hero("ミナト");
		Wizard w = new Wizard("アサカ");
		Fight fight = new Fight();
		fight.setHuman(h);
		fight.setMonster(m);
		fight.start();
		System.out.println(m);
		System.out.println(g);
		System.out.println(h);
		System.out.println(w);
	}

}
