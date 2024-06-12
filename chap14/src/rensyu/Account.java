package rensyu;

public class Account {
	String accountNumber;
	int balance;
	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String toString() {
		return "\\" + this.balance + "(口座番号@" + this.accountNumber + ")";
	}
	
	public boolean equals(Object o) {
		if (o == this) { return true; }
		if (o instanceof Account) {
			Account a = (Account) o;
			String a1 = a.accountNumber.trim();
			String a2 = this.accountNumber.trim();
			if (a1.equals(a2)) {
				return true;
			}
		}
		return false;
	}
}
