package rpg;

public class Rensyu {

	public static void main(String[] args) {
		Cleric c = new Cleric();
		c.name = "わたる";
		c.selfAid();
		int recovery = c.pray(3);
		System.out.println("ただいまの回復量: " + recovery);
	}

}
