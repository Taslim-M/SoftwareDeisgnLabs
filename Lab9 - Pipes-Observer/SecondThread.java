import java.io.*;

public class SecondThread implements Runnable {
	InputStream pin;

	public SecondThread(InputStream pin) {
		this.pin = pin;
		Thread t = new Thread(this);
		t.start();
	}

	public void run() {
		readRandoms(pin);
	}

	private void readRandoms(InputStream is) {

		DataInputStream in = new DataInputStream(new BufferedInputStream(is));
		int sum = 0;
		int size = 0;
		try {
			while (in.available() <= 0)
				; // wait till at least size is available
			size = in.read();

			for (int k = 0; k < size; ++k) {
				while (in.available() <= 0) // wait for available data
					;
				sum += in.read();

			}
			in.close();
			is.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " printing sum of all the random numbers = " + sum);
	}

}
