package date3;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		// c.set(2019,8,22,1,23,45);
		c.set(1985,6,1);
		// c.set(Calendar.MONTH, 9);
		// System.out.println(c.getTime());
		Date d = c.getTime();
		long g = d.getTime();
		System.out.println(d);
		Date now = new Date();
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");
	}

}
