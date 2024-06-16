package sql;

import java.sql.Date;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// LocalDate ==> sql.Date
		LocalDate ld = LocalDate.of(2022, 1, 2);
		Date date = Date.valueOf(ld);
		
		// sql.Date ==> LocalDate
		LocalDate ld2 = date.toLocalDate();

	}

}
