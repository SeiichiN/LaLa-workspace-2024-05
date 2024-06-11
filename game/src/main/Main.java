package main;

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
		
		Fight fight = new Fight(humans, monsters);
		fight.play();
	}
	
}
