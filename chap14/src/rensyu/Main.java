package rensyu;

public class Main {

	public static void main(String[] args) {
			Account a1 = new Account("4649", 1592);
			System.out.println(a1);
			Account a2 = new Account(" 4649", 2923);
			if (a1.equals(a2)) {
				System.out.println("同じ");
			} else {
				System.out.println("違う");
			}

	}

}
