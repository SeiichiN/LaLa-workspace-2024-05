package arraylist;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<Person> persons = new LinkedList<>();
		persons.add(new Person("ミナト", 23, "男"));
		persons.add(new Person("アサカ", 24, "女"));
		persons.add(new Person("菅原", 34, "男"));
		persons.remove(1);
		for (Person p : persons) {
			System.out.println(p);
		}

	}

}
