package code17_10;

import java.io.FileWriter;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {
		
		sub();
	}
	
	public static void sub() {
		try {
			subsub();
		} catch (IOException e) {

		}
	}
	
	public static void subsub() throws IOException {
		FileWriter fw = new FileWriter("data.txt");
		fw.write("hello");

	}
}
