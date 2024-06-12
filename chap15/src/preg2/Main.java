package preg2;

public class Main {

	public static void main(String[] args) {
		String s = "abc,def:ghi";
		
		String w = s.replaceAll("[beh]", "X");
		System.out.println(w);
		
		/*
		String[] words = s.split("[,:]");
		for (String w : words) {
			System.out.print(w + "->");
		}
		*/
	}

}
