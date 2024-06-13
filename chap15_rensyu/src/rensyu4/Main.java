package rensyu4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Date now = new Date();
		long n = now.getTime();
		System.out.println(n);
		
		long m = 100 * 24 * 60 * 60 * 1000L;
		System.out.println(m);
		
		Date d = new Date(n + m);
		System.out.println(d);
		
		SimpleDateFormat f = 
				new SimpleDateFormat("西暦yyyy年MM月dd日");
		String s = f.format(d);
		System.out.println(s);
		
	}

}
