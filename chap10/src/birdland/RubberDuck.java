package birdland;

public class RubberDuck extends Toy {
	
	public RubberDuck(String name) {
		super(name);
	}
	
	public void swim() {
		System.out.println(this.name + "はスイスイ泳ぐ");
	}
	
	public void say() {
		System.out.println("キューキュー");
	}
}
