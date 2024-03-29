import java.io.*;
import java.util.Random;

public class Exercise1 {
	private static Random r = new Random();

	private static void writeRandoms(OutputStream os) {
		System.out.println("Thread 1 generating random numbers");
		DataOutputStream out = new DataOutputStream(new BufferedOutputStream(os));
		try {
			out.write(10); // first tell the size to the reader
			for (int k = 0; k < 10; ++k) {

				int randomNumber = r.nextInt(99) + 1; // 1 to 100
				out.write((byte) randomNumber);
				System.out.println("Random value = " + randomNumber);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void readRandoms(InputStream is) {
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

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Thread 2 printing sum of all the random numbers = " + sum);
	}

	public static void main(String[] args) {
		try {
			final PipedOutputStream pos = new PipedOutputStream();
			final PipedInputStream pin = new PipedInputStream(pos);
			Runnable writer = new Runnable() {
				public void run() {
					writeRandoms(pos);
				}
			};
			Thread tWriter = new Thread(writer, "Writer");
			tWriter.start();

			Runnable reader = new Runnable() {
				public void run() {
					readRandoms(pin);
				}
			};
			Thread tReader = new Thread(reader, "Reader");
			tReader.start();
			tWriter.join();
			tReader.join();
			pos.close();
			pin.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
