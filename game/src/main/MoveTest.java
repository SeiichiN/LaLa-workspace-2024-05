package main;

public class MoveTest {

	public static void main(String[] args) {
		GamePlayer player = new GamePlayer();
		while (true) {
			player.move();
			if (player.isGameover()) {
				break;
			}
		}
		System.out.println("おつかれ〜");
	}

}
