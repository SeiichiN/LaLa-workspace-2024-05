package monster;

public abstract class WalkingMonster extends Monster {

	public abstract void attack();

	@Override
	public void run() {
		System.out.println("トコトコ走って逃げる");
	}

}
