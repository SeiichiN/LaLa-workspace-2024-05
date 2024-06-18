package main2;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		DateUtil dateUtil = new DateUtil();
		LocalDate ld = dateUtil.inputDate();
		System.out.println(ld);
	}
	
}
