package rensyu5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();  // 2024-06-13
		Period p = Period.ofDays(100);    // P100D
		LocalDate fu = now.plus(p);
		DateTimeFormatter fmt =
				DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		String s = fu.format(fmt);
		System.out.println(s);  // 西暦2024年09月21日
	}

}
