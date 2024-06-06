package birdland;

public class Magamo extends Bird
                      implements Flying, Swimming {
	
	public Magamo(String name) {
		super(name);
	}
	
	@Override
	public void say() {
		System.out.println(this.name + "はクワックワッと鳴く");
	}

	@Override
	public void fly() {
		System.out.println(this.name + "はバサバサ飛ぶ");
		
	}

	@Override
	public void swim() {
		System.out.println(this.name + "はスイスイ泳ぐ");
	}

}
