package preg;

public class Main {

	public static void main(String[] args) {
		String name = "TARO0001";
		Util util = new Util();
		if (util.isValidPlayerName(name)) {
			System.out.println("正しいプレイヤー名です");
		} else {
			System.out.println("プレイヤー名は不正です");
		}

	}
	


}
