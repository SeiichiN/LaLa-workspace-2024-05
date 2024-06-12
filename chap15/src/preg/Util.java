package preg;

public class Util {
	
	public boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
		// true / faslse
	}
}
