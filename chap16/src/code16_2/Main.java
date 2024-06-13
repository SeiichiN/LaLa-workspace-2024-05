package code16_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("源");
		names.add("アサカ");
		names.add("菅原");
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}

}
