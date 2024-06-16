package main;

import java.util.Random;

public class Brain {
	private int num;
	
	public Brain() {
		this.setNum();
	}
	
	public void setNum() {
		this.num = new Random().nextInt(99) + 1;
	}
	
	public void guess(int num) {
		if (this.num == num) {
			System.out.println("正解です");
			System.out.println("新しい数をセットしました");
			setNum();
		} else if (this.num < num) {
			System.out.println("大きすぎます");
		} else {
			System.out.println("小さすぎます");
		}
	}
	
	public int getNum() {
		return this.num;
	}
}
