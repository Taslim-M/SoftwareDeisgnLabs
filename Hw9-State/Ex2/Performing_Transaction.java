package EX2;

public class Performing_Transaction implements PossibleState {
	private ATM_Machine context;

	public Performing_Transaction(ATM_Machine m) {
		this.context = m;
	}

	@Override
	public void cancelPressed() {
		System.out.println("Wait for transaction to finish ..");
	}

	@Override
	public void pinEntered(int pin) {
		System.out.println("Already entered pin dawg ..");
	}

	@Override
	public void cardRead() {
		System.out.println("Already read card dawg..");
	}

	@Override
	public void viewBalance() {
		System.out.println("Wait for this transaction to finish ..");
	}

	@Override
	public void withdrawCash() {
		System.out.println("Wait for this transaction to finish ..");
	}

	@Override
	public void depositFunds() {
		System.out.println("Wait for transaction to finish ..");
	}

	@Override
	public void customerFinished() {
		System.out.println("Ejecting Card");
		context.setCurrentState(context.getEjecting_Card());
	}

	@Override
	public void anotherTransaction() {
		System.out.println("Choose another transaction");
		context.setCurrentState(context.getChoosing_Transaction());
	}

	@Override
	public void cardNotReadable() {
		System.out.println("Already read Card");
	}
}
