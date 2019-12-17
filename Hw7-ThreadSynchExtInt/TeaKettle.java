
public class TeaKettle {
	private Integer count = 0;

	public synchronized Boolean getKettle() {
		if (count < 6) { // pour max 6 times in total
			System.out.println(Thread.currentThread().getName() + " is pouring the tea");
			++count;
			return true; //return true if poured
		}else {
			return false; //return false if maximum times it has already been poured
		}
	}

	public static void main(String args[]) {
		TeaKettle teaKettle = new TeaKettle();
		PartyAttendee Alice = new PartyAttendee(teaKettle, "Alice");
		PartyAttendee MadHatter = new PartyAttendee(teaKettle, "MadHatter");
		Alice.start();
		MadHatter.start();
		try {
			Alice.join();
			MadHatter.join();
			System.out.println("Party ended after 6 times the tea has been poured");
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Interrupted party");
		}
		
	}
}

class PartyAttendee extends Thread {
	TeaKettle tK;

	public PartyAttendee(TeaKettle tK, String tName) {
		super(tName);
		this.tK = tK;
	}

	public void run() {
		while (tK.getKettle()) {
			//get Kettle and sleep to see others accessing it
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interrupted party");
			}
		}
	}
}