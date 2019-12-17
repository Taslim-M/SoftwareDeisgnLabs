package EX2;

public class Ejecting_Card implements PossibleState{
	private ATM_Machine context;

	public Ejecting_Card(ATM_Machine m) {
		this.context = m;
	}

	@Override
	public void cancelPressed() {
		System.out.println("Ejecting Card. Please collect ..");
	}

	@Override
	public void pinEntered(int pin) {
		System.out.println("Ejecting Card. Please collect ..");
	}

	@Override
	public void cardRead() {
		System.out.println("Ejecting Card. Please collect ..");
	}

	@Override
	public void viewBalance() {
		System.out.println("Ejecting Card. Please collect ..");
	}

	@Override
	public void withdrawCash() {
		System.out.println("Ejecting Card. Please collect ..");
	}

	@Override
	public void depositFunds() {
		System.out.println("Ejecting Card. Please collect ..");
	}

	@Override
	public void customerFinished() {
		System.out.println("Ejecting Card. Please collect ..");
	}

	@Override
	public void anotherTransaction() {
		System.out.println("Ejecting Card. Please collect ..");
	}

	@Override
	public void cardNotReadable() {
		System.out.println("Ejecting Card. Please collect ..");
	}

}
