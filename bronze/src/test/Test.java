package test;

class OutOfInkException extends Exception {
}

class Pen {

	void write() throws OutOfInkException {
	}

	protected void refillInk() throws Exception {
	}

}

class BallpointPen extends Pen {

	private void write() throws OutOfInkException {
	} // line 1

	public void refillInk() {
	} // line 2

}

public class Test {

	public static void main(String[] args) throws Exception {

		Pen p = new BallpointPen();

		p.write();

		p.refillInk();

	}

}