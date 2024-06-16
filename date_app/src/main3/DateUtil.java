package main3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class DateUtil {
	Scanner scan = new Scanner(System.in);
	
	public String inputDate() {
		System.out.print("西暦 > ");
		String year = scan.nextLine();
		System.out.print("月 > ");
		String month = scan.nextLine();
		month = "0" + month;
		month = month.substring(month.length() - 2);
		System.out.print("日 > ");
		String day = scan.nextLine();
		day = "0" + day;
		day = day.substring(day.length() - 2);
		return year + "/" + month + "/" + day;
	}

	public LocalDate getDate(String dateText) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("uuuu/MM/dd").withResolverStyle(ResolverStyle.STRICT);
		LocalDate ld = null;
		try {
			ld = LocalDate.parse(dateText, fmt);
		} catch (DateTimeParseException e) {
			System.out.println("日付の入力が不正です");
			return null;
		}
		return ld;
	}

}
