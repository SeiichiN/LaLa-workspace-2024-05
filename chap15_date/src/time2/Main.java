package time2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {
		LocalDateTime l1 = LocalDateTime.now();
		System.out.println("l1: " + l1);
		
		LocalDate ll1 = LocalDate.now();
		System.out.println("ll1: " + ll1);
		
		LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);
		System.out.println("l2: " + l2);
		
		LocalDate ll2 = LocalDate.of(2020, 1, 1);
		System.out.println("ll2: " + ll2);
		
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		System.out.println("z1: " + z1);
		
		LocalDateTime i3 = z1.toLocalDateTime();
		System.out.println("i3: " + i3);
		
		
	}

}
