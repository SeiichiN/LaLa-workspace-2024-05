package birdland;

public class Ahiru extends Bird
                    implements Swimming {
	
	public Ahiru(String name) {
		super(name);
	}
	
	@Override
	public void say() {
		System.out.println(this.name + "はガーガー鳴く");
	}

//	@Override
//	public void swim() {
//		System.out.println(this.name + "はスイスイ泳ぐ");
//	}
}
