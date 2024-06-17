package main2;

public class Main {

	public static void main(String[] args) {
		Com com = new Com();
		while (true) {
			com.inputUser();
			if (com.getUser() == 0) { break; }
			com.guess();
		}
		System.out.println("終了");
	}
	
}
