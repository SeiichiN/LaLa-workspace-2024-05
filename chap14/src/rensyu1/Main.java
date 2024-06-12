package rensyu1;

public class Main {

	public static void main(String[] args) {
		// (1)
		Account a = new Account("4649", 1592);
		System.out.println(a);
		  // "¥1592(口座番号:4649)"
		
		// (2)
		Account a1 = new Account("4649 ", 1000);
		Account a2 = new Account(" 4649", 2000);
		if (a1.equals(a2)) {
			System.out.println("同じです");
		} else {
			System.out.println("違います");
		}

	}

}
