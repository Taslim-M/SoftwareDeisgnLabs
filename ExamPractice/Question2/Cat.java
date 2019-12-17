package PracticeExam2;

public class Cat implements Runnable {

	Cat() throws InterruptedException {

		new TimeRecordingThread(this).start();
	}

	public void run() {
		System.out.println("meow");
	}
}
