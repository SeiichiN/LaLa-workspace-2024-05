package code5_14;

public class Main {
	
	public static int[] makeArray(int size) {
		int[] newArray = new int[size];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray;
	}

	public static void main(String[] args) {
		int n = 10;
		int[] array = makeArray(n);
		for (int i : array) {
			System.out.println(i);  // 0, 1, 2
		}

	}

}
