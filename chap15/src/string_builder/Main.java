package string_builder;

public class Main {

	public static void main(String[] args) {
		withSb();
		// withPlus();
	}
	
	private static void withPlus() {
		String s = "";
		for (int i = 0; i < 10000; i++) {
			s = s + "java";
			if (i % 200 == 0) {
				s = s + "\n";
			}
		}
		System.out.println(s);
	}
	
	private static void withSb() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			sb.append("Java");
			if (i % 100 == 0) {
				sb.append("\n");
			}
		}
		String s = sb.toString();
		System.out.println(s);
		
	}

}
