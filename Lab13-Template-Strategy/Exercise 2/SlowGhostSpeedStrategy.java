package Ex2;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class SlowGhostSpeedStrategy implements IGhostSpeed {

	@Override
	public void move(AtomicInteger x, AtomicInteger y) {
		Random r = new Random();
		// Increase (x,y) by 0-9
		x.set(x.get() +r.nextInt(10));
		y.set(y.get() +r.nextInt(10));
	}

}
