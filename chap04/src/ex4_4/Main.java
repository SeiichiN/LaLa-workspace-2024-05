package ex4_4;

public class Main {

	public static void main(String[] args) {
		int[] numbers = {3, 4, 9};
		System.out.println("１けたの数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		
		for (int num : numbers) {
			if (num == input) {
				System.out.println("当たり");
			}
		}
		System.out.println("ゲーム終了");

	}

}
