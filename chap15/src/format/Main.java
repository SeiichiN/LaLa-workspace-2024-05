package format;

public class Main {

	public static void main(String[] args) {
		Hero hero = new Hero();
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		/*
		String s = String.format
				(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
		System.out.println(s);
		*/
		System.out.printf(FORMAT, hero.getName(), hero.getJob(), hero.getGold());

	}

} // Mainクラス

class Hero {
	String name = "みなと";
	String job = "プログラマー";
	int gold = 1000;
	
	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}
	public int getGold() {
		return gold;
	}
	
	
}

