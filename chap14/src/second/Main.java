package second;

public class Main {

	public static void main(String[] args) {
		Object o1 = new Empty();
		Object o2 = new Hero();
		Object o3 = "こんにちは";
		printAnything(o1);
		printAnything(o2);
		printAnything(o3);

	}
	
	public static void printAnything(Object o) {
		System.out.println(o.toString());
	}

}
