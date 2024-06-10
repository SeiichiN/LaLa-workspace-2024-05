package main;

import rpg.characters.Hero;
import rpg.monsters.Matango;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		String name = "木枯紋次郎";
		h.setName(name);
		
		System.out.print("ひーろーの名前は");
		System.out.println(h.getName() + "です");
		
		Matango m = new Matango();
		m.attack(h);
		h.attack(m);
	}

}

