package main2;

import java.util.Random;
import java.util.Scanner;

public class Com {
	private int num;
	private int user;
	
	public Com() {
		this.setNum();
	}
	
	public void inputUser() {
		Scanner scanner = new Scanner(System.in);
		int num = -1;
		do {
			System.out.print("1...99の数を推測(0:終了) > ");
			try {
				num = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("1〜99の数字を入力してください。");
			}
		} while(num < 0 || num > 99);
		this.user = num;
	}

	public int getUser() {
		return user;
	}

	public void setNum() {
		this.num = new Random().nextInt(99) + 1;
	}
	
	public void guess() {
		if (this.num == this.user) {
			System.out.println("正解です");
			System.out.println("新しい数をセットしました");
			setNum();
		} else if (this.num < this.user) {
			System.out.println("大きすぎます");
		} else {
			System.out.println("小さすぎます");
		}
	}
	
	public int getNum() {
		return this.num;
	}
}