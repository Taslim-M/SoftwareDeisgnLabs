package EX2;

import java.util.Random;

public class Reading_Card implements PossibleState {
	private ATM_Machine context;
	public Reading_Card(ATM_Machine m) {
		this.context=m;
	}
	@Override
	public void cancelPressed() {
		System.out.println("Cannot do that here");
	}

	@Override
	public void pinEntered(int pin) {
		System.out.println("Wait for reading ..");
	}

	@Override
	public void cardRead() {
		int random = 250+ (new Random()).nextInt(500);
		System.out.println("Card Read succesffully.");
		context.setCurrentAccountBalance(random);
		context.setCurrentState(context.getReading_Pin());
	}

	@Override
	public void viewBalance() {
		System.out.println("Wait for reading ..");
	}

	@Override
	public void withdrawCash() {
		System.out.println("Wait for reading ..");
	}

	@Override
	public void depositFunds() {
		System.out.println("Wait for reading ..");
	}

	@Override
	public void customerFinished() {
		System.out.println("Wait for reading ..");
	}

	@Override
	public void anotherTransaction() {
		System.out.println("Wait for reading ..");
	}

	@Override
	public void cardNotReadable() {
		System.out.println("Ejecting Card");
		context.setCurrentState(context.getEjecting_Card());
	}

}
