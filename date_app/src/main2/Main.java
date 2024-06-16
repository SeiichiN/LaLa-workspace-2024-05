package main2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		DateUtil dateUtil = new DateUtil();
		LocalDate ld = null;
		while (ld == null) {
			System.out.println("日付を入力");
			ld = dateUtil.inputDate();
		}
		System.out.println(ld);
	}
	
}
