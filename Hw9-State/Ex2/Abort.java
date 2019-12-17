package EX2;

public class Abort implements PossibleState{
	private ATM_Machine context;

	public Abort(ATM_Machine m) {
		this.context = m;
	}

	@Override
	public void cancelPressed() {
		System.out.println("Aborted State: Contact Bank");
	}

	@Override
	public void pinEntered(int pin) {
		System.out.println("Aborted State: Contact Bank");
	}

	@Override
	public void cardRead() {
		System.out.println("Aborted State: Contact Bank");
	}

	@Override
	public void viewBalance() {
		System.out.println("Aborted State: Contact Bank");
	}

	@Override
	public void withdrawCash() {
		System.out.println("Aborted State: Contact Bank");
	}

	@Override
	public void depositFunds() {
		System.out.println("Aborted State: Contact Bank");
	}

	@Override
	public void customerFinished() {
		System.out.println("Aborted State: Contact Bank");
	}

	@Override
	public void anotherTransaction() {
		System.out.println("Aborted State: Contact Bank");
	}

	@Override
	public void cardNotReadable() {
		System.out.println("Aborted State: Contact Bank");
	}
}
