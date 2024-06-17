package main2;

import java.time.LocalDate;

public class personTest {

	public static void main(String[] args) {
		DateUtil util = new DateUtil();
		LocalDate date = util.inputDate();
		Person p = new Person();
		p.setBirthday(date);
		System.out.println(p.getAge());
	}

}
