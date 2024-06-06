package birdland;

public interface Swimming {
	default void swim() {
		System.out.println("スイスイ泳ぐ");
	}
}
