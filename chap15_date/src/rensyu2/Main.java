package rensyu2;

public class Main {

	public static void main(String[] args) {
		String file = "readme.txt";
		String folder1 = "c:\\javadev";
		String folder2 = "c:\\user\\";

		System.out.println(getPath(folder1, file));
	}
	
	public static String getPath(String folder, String file) {
		if (!folder.endsWith("\\")) {
			folder = folder + "\\";
		}
		return folder + file;
	}

}
