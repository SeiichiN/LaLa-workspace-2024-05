package ex5_2;

public class Main {
	
	// 練習 5-3
	public static void email(String address, String text) {
		System.out.println
		  (address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	
	public static void main(String[] args) {
		// String subject = "業務連絡";
		String address = "abc@efg.hi";
		String body = "明日お休みをいただけませんか？";
		email(address, body);
	}

}
