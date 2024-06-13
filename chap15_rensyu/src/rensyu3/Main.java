package rensyu3;

public class Main {

	public static void main(String[] args) {
		String target = "UWBD";
		String pattern = "U[A-Z]{3}";
		
		if (target.matches(pattern)) {
			System.out.println("マッチしました");
		} else {
			System.out.println("マッチしません");
		}

	}

}
