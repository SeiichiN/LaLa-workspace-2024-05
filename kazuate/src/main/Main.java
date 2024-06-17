package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Com com = new Com();
		while (true) {
			int num = inputNum();
			if (num == 0) { break; }
			com.guess(num);
		}
		System.out.println("終了");
	}
	
	private static int inputNum() {
		int num = -1;
		do {
			System.out.print("1...99の数を推測(0:終了) > ");
			try {
				num = new Scanner(System.in).nextInt();
			} catch (InputMismatchException e) {
				System.out.println("1〜99の数字を入力してください。");
			}
		} while(num < 0 || num > 99);
		return num;
	}
}
