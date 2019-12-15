package Ex2;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class MediumGhostSpeedStrategy implements IGhostSpeed {

	@Override
	public void move(AtomicInteger x, AtomicInteger y) {
		Random r = new Random();
		//Increase (x,y) by 10-25
		x.set(x.get()+ 10 +r.nextInt(15));
		y.set(y.get()+ 10 +r.nextInt(15));
		
	}


}
