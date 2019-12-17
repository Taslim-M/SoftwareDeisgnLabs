package Ex1;

import java.util.ArrayList;

public class Patient implements Subject, Runnable {
	public String patientName;
	public Integer temperature;
	private ArrayList<Observer> doctors;

	public Patient(String patientName) {
		this.patientName = patientName;
		doctors = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		doctors.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = doctors.indexOf(o);
		if (i >= 0)
			doctors.remove(i);

	}

	@Override
	public void notifyObservers() {
		for (Observer observer : doctors) {
			observer.update(this);
		}
	}

	public void tempChange(int t) {
		this.temperature = t;
		notifyObservers();
	}

	@Override
	public void run() {
		for (int k = 0; k < 10; ++k) { // run 10 times to test
			tempChange((int) (96 + Math.random() * 10));
			try {
				Thread.sleep(10000); // sleep for 10 sec
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
