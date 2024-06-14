package rensyu;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		var enemies = new HashMap<Hero, Integer>(); 
		enemies.put(h1, 3);
		enemies.put(h2, 7);
		for (Hero h : enemies.keySet()) {
			int v = enemies.get(h);
			System.out.println
			  (h.getName() + "が倒した数=" + v);
		}
	}

	
	public static void ans() {
		Map<Hero, Integer> enemies = new HashMap<>();
		enemies.put(new Hero("斎藤"), 3);
		enemies.put(new Hero("鈴木"), 7);
		for (Hero h : enemies.keySet()) {
			int enemy = enemies.get(h);
			System.out.println(h.getName() + ":" + enemy);
		}
	}
}
