package rensyu;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Hero> heros = new ArrayList<>();
		Hero h = new Hero("斎藤");
		heros.add(h);
		heros.add(new Hero("鈴木"));
		for (Hero m : heros) {
			System.out.println(m.getName());
		}
	}

}
