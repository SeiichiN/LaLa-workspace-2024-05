package ex5_4;

public class Main {

	public static double calcTriangleArea(double bottom, double height) {
		return  bottom * height / 2.0;
	}
	
	public static double calcCircleArea(double radius) {
		return radius * radius * Math.PI;  // 3.14
	}
	
	public static void main(String[] args) {
		double triangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println
		  ("三角形の面積は" + triangleArea + "平方センチメートル");
		double circleArea = calcCircleArea(5.0);
		System.out.println
		  ("円の面積は" + circleArea + "平方センチメートル");
	}

}
