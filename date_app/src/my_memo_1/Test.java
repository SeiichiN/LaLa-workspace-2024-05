package my_memo_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class Test {
	static final String PATTERN = "yyyy/MM/dd";

	public static void main(String[] args) {
		String text = "1999/09/09";
		if (isDate(text)) {
			System.out.println("正しい日付です");
		} else {
			System.out.println("不正な日付です");
		}
	}
	
	public static boolean isDate(String dateText) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern(PATTERN)
				.withResolverStyle(ResolverStyle.STRICT);
		try {
			LocalDate.parse(dateText, fmt);
		} catch (DateTimeParseException e) {
			return false;
		}
		return true;
	}

}
