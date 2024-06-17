package main2;

import java.time.LocalDate;
import java.time.Period;

public class Person {
	private LocalDate birthday;

	public int getAge() {
		LocalDate now = LocalDate.now();
		Period p = Period.between(birthday, now);
		int age = p.getYears(); 
		return age;
	}
	
	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
	
}
