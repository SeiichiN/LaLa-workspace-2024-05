package birdland;

public class SwimBird extends Bird {
	
	public SwimBird(String name) {
		super(name);
	}

	public void swim() {
		System.out.println(this.name + "はスイスイ泳ぐ");
	}
}
