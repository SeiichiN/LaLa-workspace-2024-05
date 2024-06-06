package rensyu;

public class Main {

	public static void main(String[] args) {
		
		Book b = new Book("本", 1000, "白", "222-222");
		b.setWeight(125.0);
		System.out.println(b.getName());
		System.out.println(b.getPrice());
		System.out.println(b.getColor());
		System.out.println(b.getIsbn());
		System.out.println(b.getWeight());
		

		Computer c = new Computer("Windows", 100000, "黒", "HP");
		c.setWeight(1000);
		System.out.println(c.getName());
		System.out.println(c.getPrice());
		System.out.println(c.getColor());
		System.out.println(c.getMakerName());
		System.out.println(c.getWeight());
	}

}
