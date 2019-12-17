class Callme {
	void call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("interrupted");
		}
		System.out.println("]");

	}
}

class Caller implements Runnable {
	String msg;
	Callme target;
	Thread t;

	public Caller(Callme targ, String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		synchronized (target) {
			target.call(msg);
		}

	}

}

public class Lab6E1 {
	public static void main(String args[]) {
		Callme target = new Callme();
		Caller one = new Caller(target, "One");
		Caller two = new Caller(target, "Two");
		Caller three = new Caller(target, "Three");
	}
}
