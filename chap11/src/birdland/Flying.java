package birdland;

public interface Flying {
	
	public default void fly() {
		System.out.println("バサバサ飛ぶ");
	}
}
