package Ex3;

import java.util.ArrayList;

public class Faculty implements Subject {
	String fName;
	Course msg;
	private ArrayList<Observer> observers;

	public Faculty(String fName) {
		observers = new ArrayList();
		this.fName = fName;
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0)
			observers.remove(i);

	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(msg);
			System.out.println(fName + " and the new course name is" + msg.getcName() + " for the sem " + msg.getSem());
		}
	}

	public void newAnnouncement(Course msg) {
		this.msg = msg;
		notifyObservers();
	}

}
