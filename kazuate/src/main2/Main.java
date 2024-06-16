package main2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Brain brain = new Brain();
		while (true) {
			brain.inputNum();
			if (brain.getUser() == 0) { break; }
			brain.guess();
		}
		System.out.println("終了");
	}
	
}
