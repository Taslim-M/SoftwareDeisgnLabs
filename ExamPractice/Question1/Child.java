package PracticeExam1;
import java.io.*;
import java.util.Random;

public class Child implements Runnable{
	OutputStream os;
	Thread ch;
	public Child(OutputStream os) {
		this.os = os;
		ch= new Thread(this);
		ch.start();
	}

	@Override
	public void run() {
		DataOutputStream ds = new DataOutputStream(new BufferedOutputStream(os));
		Random r = new Random();
		try {
			Thread.sleep(r.nextInt(5000));
			ds.writeUTF(this.toString() + " " + r.nextInt(2));
			ds.flush();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
