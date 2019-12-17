package Ex1;

public class Ex1 {
	public static void main(String[] args) {
		Endocrinologist end = new Endocrinologist("sam");
		Physician phy = new Physician("tom");
		Patient patient = new Patient("Mohamed");
		patient.registerObserver(end);
		patient.registerObserver(phy);
		Thread t = new Thread(patient);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
