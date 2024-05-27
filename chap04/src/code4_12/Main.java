package code4_12;

public class Main {

	public static void main(String[] args) {
		int[] seq = new int[10];
		
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		
		char[] base = {'A', 'T', 'G', 'C'};
		
		for (int i = 0; i < seq.length; i++) {
			int baseType = seq[i];
			char baseChar = base[baseType];
			System.out.print(baseChar + " ");
		}
	}

}
