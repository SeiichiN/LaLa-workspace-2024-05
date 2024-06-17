package osarai;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("maido.txt");
			fw.write("まいど");
		} catch (IOException e) {
			System.out.println("ファイルをオープンできません");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					;  // 何もできない
				}
			}
		}
		
	}

}
