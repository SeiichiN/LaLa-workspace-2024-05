package main2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DateUtil {
	public LocalDate inputDate() {
		Scanner scan = new Scanner(System.in);
		LocalDate ld = null;
		try {
			System.out.print("西暦 > ");
			int year = Integer.parseInt(scan.nextLine());
			System.out.print("月 > ");
			int month = Integer.parseInt(scan.nextLine());
			System.out.print("日 > ");
			int day = Integer.parseInt(scan.nextLine());
			ld = LocalDate.of(year, month, day);
		} catch (NumberFormatException e) {
			System.out.println("数字ではありません");
		} catch (DateTimeException e) {
			System.out.println("正しい日付ではありません");
		}
		return ld;
	}
}
