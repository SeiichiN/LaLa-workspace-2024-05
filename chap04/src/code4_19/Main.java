package code4_19;

public class Main {

	public static void main(String[] args) {
		
		int[][] scores = {{40, 50, 60}, {80, 60, 70}};
		System.out.println(scores.length);     // 2
		System.out.println(scores[0].length);  // 3
		System.out.println(scores[1].length);  // 3

		for (int[] subs : scores) {
			for (int sub : subs) {
				System.out.println(sub);
			}
		}
	}

}
