package Ex2;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class FastGhostSpeedStrategy implements IGhostSpeed{

	@Override
	public void move(AtomicInteger x, AtomicInteger y) {
		Random r = new Random();
		//Increase (x,y) by 25-50
		x.set(x.get()+ 25 +r.nextInt(25));
		y.set(y.get()+ 25 +r.nextInt(25));
	}

}
