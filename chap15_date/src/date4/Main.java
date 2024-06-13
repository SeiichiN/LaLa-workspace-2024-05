package date4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat f =
				new SimpleDateFormat("yyyy/MM/dd");
		// Date d = f.parse("2020/09/22 01:23:45");
		Date d = f.parse("1955/6/27");
		System.out.println(d);
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		Date now = new Date();
		String s = f.format(now);
		System.out.println(s);
	}

}
