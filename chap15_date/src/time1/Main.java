package time1;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {
		Instant i1 = Instant.now();
		System.out.println("i1: " + i1);
		
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		System.out.println("i2: " + i2);
		
		long l = i2.toEpochMilli();
		System.out.println("l : " + l);
		
		ZonedDateTime z1 = ZonedDateTime.now();
		System.out.println("z1: " + z1);
		// 東京時間
		ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
		System.out.println("z2: " + z2);
		// 世界標準時に変換
		Instant i3 = z2.toInstant();
		System.out.println("i3: " + i3);
		// i3と同じ時間（ロンドン時間）
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
		System.out.println("z3: " + z3);
		
		
		System.out.println
		  ("東京:" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		System.out.println
		  ("ロンドン:" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
		if (z2.isEqual(z3)) {
			System.out.println("同じ瞬間");
		}
	}

}
