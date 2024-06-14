package arraylist;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Person> persons = new LinkedList<>();
		persons.add(new Person("湊", 23, "男"));
		persons.add(new Person("朝香", 24, "女"));
		persons.add(new Person("かぐや姫", 20, "女"));
		persons.add(new Person("菅原", 35, "男"));
		persons.remove(2);
		for (Person n : persons) {
			System.out.println(n);
		}
	}

}
