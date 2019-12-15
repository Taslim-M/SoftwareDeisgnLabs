package Ex3;

import java.util.Random;

public class Cat {
	public boolean isAwake = false;

	public void sleepCat() {
		isAwake = false;
	}

	public void awakeCat() {
		isAwake = true;
	}

	public String status() {
		if (isAwake)
			return "awake";
		else
			return "sleeping";
	}
}
