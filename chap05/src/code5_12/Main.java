package code5_12;

public class Main {

	public static void printArray(int[] array) {
		array[0] = 100;
		for (int element : array) {
			System.out.println(element);  // 100, 2, 3
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		printArray(array);
		System.out.println(array[0]);  // 100
	}

}
