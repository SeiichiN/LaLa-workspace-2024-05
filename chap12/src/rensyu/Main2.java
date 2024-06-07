package rensyu;

public class Main2 {

	public static void main(String[] args) {
		Y[] obj = new Y[2];
		obj[0] = new A();
		obj[1] = new B();
		
		obj[0].b();
		obj[1].b();
		
		for (Y y : obj) {
			y.b();
		}
	}

}
