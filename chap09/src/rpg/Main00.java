package rpg;

public class Main00 {

	public static void main(String[] args) {
		Hero h1;
		h1 = new Hero();
		h1.hp = 100;
		h1.name = "ミナト";
		
		Hero h2;
		h2 = new Hero();
		h2.hp = 80;
		h2.name = "あさか";
		
		System.out.println(h1.name + ":" + h1.hp);
		System.out.println(h2.name + ":" + h2.hp);

	}

}
