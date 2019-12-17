import java.io.*;

public class q1 {
	public static void main(String[] args) throws FileNotFoundException {
		InputStream fis = new FileInputStream("input");
		OutputStream fos = new FileOutputStream("output");
		CopyThread t = new CopyThread(fis, fos, "Copy thread");
		t.start();
		try {
			t.join();
			fis.close();
			fos.close();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

class CopyThread extends Thread {
	InputStream is;
	OutputStream os;

	public CopyThread(InputStream is, OutputStream os, String threadName) {
		this.is = is;
		this.os = os;
		Thread t = Thread.currentThread();
		t.setName(threadName);
	}

	public void run() {
		try {
			while (is.available() > 0) {
				int data = is.read();
				os.write(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Copy thread finished copying");
	}
}