package birdland;

public class RubberDuck extends Toy
                          implements Swimming {
	
	public RubberDuck(String name) {
		super(name);
	}
	
	@Override
	public void swim() {
		System.out.println(this.name + "はスイスイ泳ぐ");
	}
	
	public void say() {
		System.out.println(this.name + "はキューキューと鳴く");
	}
}
