import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
//Merger
public class q2 {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			InputStream fis1 = new FileInputStream("input1");
			InputStream fis2 = new FileInputStream("input2");
			OutputStream fos = new FileOutputStream("output");
			Copy2Thread t = new Copy2Thread(fis1, fis2, fos, "Copy thread");
			t.start();
			t.join();
			fis1.close();
			fis2.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Copy2Thread extends Thread {
	InputStream is1;
	InputStream is2;
	OutputStream os;

	public Copy2Thread(InputStream is1, InputStream is2, OutputStream os, String threadName) {
		this.is1 = is1;
		this.is2 = is2;
		this.os = os;
		Thread t = Thread.currentThread();
		t.setName(threadName);
	}

	public void run() {
		try {
			is1.transferTo(os);
			is2.transferTo(os);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}