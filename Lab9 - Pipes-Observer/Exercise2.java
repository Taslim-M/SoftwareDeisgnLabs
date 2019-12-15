import java.io.*;

public class Exercise2 {

	public static void main(String[] args) {
		try {
			PipedOutputStream pos = new PipedOutputStream();
			PipedInputStream pin = new PipedInputStream(pos);
			FirstThread ft = new FirstThread(pos);
			SecondThread st = new SecondThread(pin);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
