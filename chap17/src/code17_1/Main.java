package code17_1;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args)  {
		String str = "Hello";
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write(str);
		} catch (IOException e) {
			System.out.println("何等かの例外が発生しました");
		} finally {
			System.out.println("finally!!!!");
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					;
				}
			}
		}
	
		System.out.println("処理終了");
	}

}
