package rpg;

public class Test {

	public static void main(String[] args) {
		
		Hero h1 = new Hero("ミナト");
		System.out.println(h1.name);
		
		Hero h2 = new Hero();
		System.out.println(h2.name);

		Wizard w = new Wizard();
		System.out.println(w.name);
		
		Sword s = new Sword();
	}

}
