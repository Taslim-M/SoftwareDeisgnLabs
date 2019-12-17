package PracticeExam2;

import java.util.*;

public class TimeRecordingThread {
	Runnable toTest;

	TimeRecordingThread(Runnable run) {
		toTest = run;
	}

	public void start() {
		printMessage("started");
		Thread t = new Thread(this.toTest);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		printMessage("ended");
	}

	private void printMessage(String ended) {
		String msg = new String();
		Calendar calendar = new GregorianCalendar();
		if (toTest instanceof Cat) {
			msg = "I do not tell time to Cats! ";
		} else {
			if (calendar.get(Calendar.HOUR_OF_DAY) < 14) {
				msg = "good morning";
			} else {
				msg = "not good morning";
			}
		}
		
		System.out.println(msg+" " + this.toString()+ " " +ended +" on" + calendar.getTime());
	}
}
