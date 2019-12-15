package Ex2;

import java.util.concurrent.atomic.AtomicInteger;

public class Ghost {
	IGhostSpeed currentSpeedBehavior;
	AtomicInteger xPosition, yPosition;
	
	public Ghost(){
		currentSpeedBehavior = new SlowGhostSpeedStrategy();
		xPosition= new AtomicInteger(0);
		yPosition=new AtomicInteger(0);
	}
	public void setSpeedBehavior(IGhostSpeed newSpeed) {
		currentSpeedBehavior = newSpeed;
	}
	
	public void moveGhost() {
		currentSpeedBehavior.move(xPosition,yPosition);
		System.out.println("Ghost " + this.toString() +" at speed ("+ xPosition+ ","+yPosition +")");
	}
}
