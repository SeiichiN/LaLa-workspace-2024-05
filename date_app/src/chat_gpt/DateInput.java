package chat_gpt;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LocalDate date = null;

		while (date == null) {
			try {
				System.out.println("年を入力してください (例: 2024): ");
				int year = Integer.parseInt(scanner.nextLine());

				System.out.println("月を入力してください (1-12): ");
				int month = Integer.parseInt(scanner.nextLine());

				System.out.println("日を入力してください (1-31): ");
				int day = Integer.parseInt(scanner.nextLine());

				date = LocalDate.of(year, month, day);
				System.out.println("入力された日付は: " + date);

			} catch (NumberFormatException e) {
				System.out.println("数値を入力してください。");
			} catch (DateTimeException | IllegalArgumentException e) {
				System.out.println("正しい日付を入力してください。");
			}
		}

		scanner.close();

	}

}
