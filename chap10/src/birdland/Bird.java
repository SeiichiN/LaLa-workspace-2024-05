package birdland;

public class Bird {
	String name;
	
	public Bird(String name) {
		this.name = name;
	}
	
	public void say() {
		System.out.println(this.name + "はチュッチュッチュッ");
	}
}
