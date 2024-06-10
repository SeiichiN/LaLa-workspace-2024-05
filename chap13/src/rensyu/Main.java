package rensyu;

import rpg.characters.Hero;
import rpg.characters.Wand;
import rpg.characters.Wizard;

public class Main {

	public static void main(String[] args) {
		// Wand wand = new Wand();
		// wand.setName("魔法の杖");
		// wand.setPower(50.5);
		Wand wand = null;
		
		Wizard w = new Wizard(wand);
		w.setName("アサか");
		w.setHp(100);
		w.setMp(50);
		
		Hero h = new Hero();
		h.setName("ミナト");
		w.heal(h);

	}

}
