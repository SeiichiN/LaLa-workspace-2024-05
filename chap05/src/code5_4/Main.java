package code5_4;

public class Main {

	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello("湊");
		hello("朝香");
		hello("菅原");
		System.out.println("メソッド呼び出しがおわりました。");
	}
	
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}

}
