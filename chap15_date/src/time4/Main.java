package time4;

import java.time.LocalDate;
import java.time.Period;

public class Main {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2020, 1, 1);
		LocalDate d2 = LocalDate.of(2020, 1, 4);
		
		Period p1 = Period.ofDays(3);
		Period p2 = Period.between(d1, d2);
		System.out.println("p1: " + p1);  // P3D
		System.out.println("p2: " + p2);  // P3D
		
		LocalDate d3 = d2.plus(p2);      // p1でも同じ
		System.out.println("d3: " + d3);  // 2020-01-07
	}

}
