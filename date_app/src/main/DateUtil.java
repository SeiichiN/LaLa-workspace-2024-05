package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class DateUtil {
	public String inputDate() {
		String[] argsYear = { "西暦 (4桁の数字) > ", "[0-9]{4}", "4桁の数字で入力してください" };
		String[] argsMonth = { "月 > ", "[0-9]{1,2}", "1桁もしくは2桁の数字で入力してください" };
		String[] argsDay = { "日 > ", "[0-9]{1,2}", "1桁もしくは2桁の数字で入力してください" };

		String year = getDateString(argsYear);
		String month = getDateString(argsMonth);
		month = "0" + month;
		month = month.substring(month.length() - 2);
		String day = getDateString(argsDay);
		day = "0" + day;
		day = day.substring(day.length() - 2);
		return year + "/" + month + "/" + day;
	}

	// args[0] -- 入力を促す文字列
	// args[1] -- 日付形式をチェックする正規表現パターン
	// args[2] -- 日付が不正なときにそれを指摘するメッセージ
	private String getDateString(String[] args) {
		boolean isInput = false;
		String data = null;
		while (!isInput) {
			System.out.print(args[0]);
			data = new Scanner(System.in).nextLine();
			if (data.matches(args[1])) {
				isInput = true;
			} else {
				System.out.println(args[2]);
			}
		}
		return data;
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
