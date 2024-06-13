package rensyu2;

public class Main {

	public static void main(String[] args) {
		String folder = "c:\\javadev";
		// String folder = "c:\\user\\";
		String file = "readme.txt";
		Util util = new Util();
		String s = util.renketsu(folder, file);
		System.out.println(s);  // c:\javadev\readme.txt
	}


}
