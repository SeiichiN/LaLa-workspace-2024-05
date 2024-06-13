package rensyu1;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			sb.append(i).append(",");
		}
		// System.out.println(sb);
		String s = sb.toString();
		System.out.println(s);
		String[] a = s.split(",");
		// System.out.println(a);
	}

}
