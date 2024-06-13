package rensyu2;

public class Util {
	
	public String renketsu(String folder, String file) {
		if (!folder.endsWith("\\")) {
			folder = folder + "\\";
		}
		return folder + file;
	}
}
