package test2;

class Car {

	int cno;

	String name;

	public Car(int cno, String name) {

		this.cno = cno;

		this.name = name;

	}

	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		Car other = (Car) obj;

		if (this.name.equals(other.name)) {

			return true;

		} else {

			return false;

		}

	}

}

public class Test {

	public static void main(String[] args) {

		Car c1 = new Car(1234, "Taxi");

		Car c2 = c1;

		Car c3 = new Car(9876, "Taxi");

		System.out.println(c1.equals(c2));

		System.out.println(c1 == c2);

		System.out.println(c1.equals(c3));

		System.out.println(c1 == c3);

	}

}
