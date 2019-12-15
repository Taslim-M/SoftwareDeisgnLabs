import java.io.*;
import java.util.Random;

public class FirstThread implements Runnable {
	OutputStream pos;
	private  Random r = new Random();
	Thread ft;
	public FirstThread(OutputStream pos) {
		this.pos = pos;
		ft = new Thread(this);
		ft.start();
	}

	@Override
	public void run() {
		writeRandoms(pos);
	}
	private void writeRandoms(OutputStream os) {
		System.out.println( Thread.currentThread().getName() + " generating random numbers");
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
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}