package birdland;

public interface Swimming {
	
	public default void swim() {
		System.out.println("スイスイ泳ぐ");
	}
}
