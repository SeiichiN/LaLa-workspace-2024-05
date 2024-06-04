package monster;

public abstract class FlyingMonster extends Monster {
	
	public abstract void attack();
	
	public void run() {
		System.out.println("バサバサ飛んで逃げる");
	}
}
