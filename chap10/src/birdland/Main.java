package birdland;

public class Main {

	public static void main(String[] args) {
		Magamo magamo = new Magamo();
		magamo.name = "真鴨";
		magamo.say();
		magamo.swim();
		magamo.fly();
		
		Aigamo aigamo = new Aigamo();
		aigamo.name = "合鴨";
		aigamo.say();
		aigamo.swim();
		
		Ahiru ahiru = new Ahiru();
		ahiru.name = "アヒル";
		ahiru.say();
		ahiru.swim();
		
		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.name = "ラバーダック";
		rubberDuck.swim();
	}

}
