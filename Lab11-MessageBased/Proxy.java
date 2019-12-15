import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Proxy implements Runnable, Observer {

	InputStream in;
	OutputStream out;
	Dispatcher d;
	Byte hardwareID;

	Proxy(Byte id, InputStream in, OutputStream out, Dispatcher d) throws IOException {

		// setup input and output streams
		this.in = new BufferedInputStream(in);
		this.out = new BufferedOutputStream(out);
		this.d = d;
		// Read ID Mask
		this.hardwareID = id;
		// register yourself as a proxy with the dispatcher
		d.registerObserver(this);

		// start your thread
		new Thread(this).start();
	}

	void send_msg(msg m) throws IOException {
		// tell the dispatcher to send your message
		d.send_msg(this, m);
	}

	public void run() {
		byte b;
		while (true) {

			// logic of proxy here
			// this on is implementing simple
			// forwarding of message to the dispacher

			try {
				if (in.available() > 0) {

					// read a byte from the input stream
					// this will come from the Application or the Game class.

					b = (byte) in.read();

					Debug.trace(this + " sending " + b + " to the dispatcher");

					// just send to out the dispatcher
					d.send_msg(this, new msg(b));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}


	@Override
	public void call_back(msg m) {
		// call-back function -- will be called by dispatcher
		// then decide to do what with the incoming message
		try {
			Debug.trace("Message " + m.value + " received by " + this + " from dispacher");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}