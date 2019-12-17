package PracticeExam2;

public class Dog implements Runnable {
	
	Dog() throws InterruptedException{
		
		new TimeRecordingThread(this).start();
	}

	public void run() {
		System.out.println("bow bow");
	}
}
