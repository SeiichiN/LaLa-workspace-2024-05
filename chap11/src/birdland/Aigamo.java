package birdland;

public class Aigamo extends Bird
                      implements Swimming {
	
	public Aigamo(String name) {
		super(name);
	}
	
	@Override
	public void say() {
		System.out.println(this.name + "はグワッグワッと鳴く");
	}

	@Override
	public void swim() {
		System.out.println(this.name + "はスイスイ泳ぐ");
	}
}
