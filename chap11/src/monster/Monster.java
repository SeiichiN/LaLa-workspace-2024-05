package monster;

public abstract class Monster {
	int hp = 100;
	int mp = 50;
	
	public abstract void attack();
	
	public abstract void run();
}
