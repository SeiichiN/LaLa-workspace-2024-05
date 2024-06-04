package birdland;

public class Main {

	public static void main(String[] args) {
		Magamo magamo = new Magamo("真鴨");
		magamo.say();
		magamo.swim();
		magamo.fly();
		
		Aigamo aigamo = new Aigamo("合鴨");
		aigamo.say();
		aigamo.swim();
		
		Ahiru ahiru = new Ahiru("アヒル");
		ahiru.say();
		ahiru.swim();
		
		RubberDuck rubberDuck = new RubberDuck("ラバーダック");
		rubberDuck.swim();
		rubberDuck.say();
	}

}
