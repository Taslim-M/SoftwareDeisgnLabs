package PracticeExam1;
import java.io.*;

public class Spawner implements Runnable {

	InputStream in;
	int count;
	Thread spawnerThread;
	PipedOutputStream pos;
	public Spawner(InputStream in, int count) {
		this.in = in;
		this.count = count;
		
		try {
			pos = new PipedOutputStream((PipedInputStream) in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		spawnerThread = new Thread(this);
		spawnerThread.start();

	}

	@Override
	public void run() {
		for(int k=0;k<count;++k) {
			new Child(pos);
		}
		DataInputStream din = new DataInputStream(new BufferedInputStream(in));
		for(int k=0;k<count;++k) {
			try {
				while(din.available() <=0);//wait
				String toPrint = din.readUTF();
				System.out.println(toPrint);
				
			} catch (IOException e) {
				e.printStackTrace();
			} 
			
		}
		
	}
}
